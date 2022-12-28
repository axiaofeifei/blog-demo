package behavior.observer.sample_2;


import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 8:10
 *
 */

public class WeatherStation_2 {
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
