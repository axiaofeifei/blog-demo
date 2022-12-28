package behavior.observer.sample_2;



import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:19
 */
//使用JDK自带的api
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }



    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature= temperature;
        this.humidity=humidity;
        this.pressure= pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        //通知的对象为null,所以我们我这里用的是拉的方式
        notifyObservers();
        //通知的对象存在,这里我们用的是推的方式
        //notifyObservers(new CurrentConditionsDisplay);
    }



    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }



}
