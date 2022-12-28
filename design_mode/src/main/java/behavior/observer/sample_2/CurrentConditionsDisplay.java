package behavior.observer.sample_2;


import behavior.observer.sample_1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:33
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("当前的温度："+temperature+"最近的湿度："+humidity);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
