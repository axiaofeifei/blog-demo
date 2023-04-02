package behavior.observer.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:33
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;

    private float humidity;

    private Subject weatherData;
    //每个显示板都是一个潜在的观察者，当显示板一建立的时候就注册到主题中
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerbserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前的温度："+temperature+"最近的湿度："+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
