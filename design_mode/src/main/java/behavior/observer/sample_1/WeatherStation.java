package behavior.observer.sample_1;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 8:10
 *
 */
//需求：当weatherData的信息一更新，展示面板就显示最新的数据
//    subject主题接口，weatherData实现subject接口
//    Observer观察者接口，CurrentConditionsDisplay显示面板实现Observer接口

//    weatherData作为CurrentConditionsDisplay的属性，CurrentConditionsDisplay的构造方法创建对象时，
//    直接将对象注册到weatherData的存放观察者的队列中
//
//    当weather的气温,湿度,预测一更新时,调用主题的通知方法-逐个通知观察者
//    主题的通知方法调用观察者的更新方法
//    观察者的更新方法更新后调用 显示方法


//    这里统一都是subject推送信息到观察者,
//    每次subject增加内容都需要推送,推送了很多观察者不需要的内容
//    我们可以设计让观察者拉去自己需要的数据
public class WeatherStation {
    @Test
    public void test(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(34,23,34);
        weatherData.setMeasurements(24,13,33);
        weatherData.setMeasurements(44,43,24);
        weatherData.setMeasurements(14,22,24);
    }
}
