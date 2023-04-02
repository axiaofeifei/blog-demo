package behavior.observer.sample_3;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 11:15
 */
//这里就是数据变化的地方
//    控制台就是信息展示的地方

public class Test_3 {

    @Test
    public void test(){
        SubjectSample weatherData = new SubjectSample();
        ObserverSample observerSample = new ObserverSample(weatherData);

        weatherData.setMeasurements("34","23","34");
        weatherData.setMeasurements("24","13","33");
        weatherData.setMeasurements("44","43","24");
        weatherData.setMeasurements("14","22","24");
    }
}
