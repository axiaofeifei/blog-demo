package behavior.observer.sample_1;

import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:19
 */
public class WeatherData implements Subject{
    private ArrayList observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList();
    }

    @Override
    public void registerbserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i > 0) {
            observerList.remove(o);
        }
    }
    //将主题的变化通知每一个观察者
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = (Observer)observerList.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature= temperature;
        this.humidity=humidity;
        this.pressure= pressure;
        measurementsChanged();
    }

}
