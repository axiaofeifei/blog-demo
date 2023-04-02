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

/*    你已经从我们的原则中得知这不是一件好事，但是，这到底会造成什么问题呢?
            首先，因为0bservable是一个“类”，你必须设计一个类继承它。
            如果某类想同时具有Observale类和另一个超类的行为，就会陷入两难，
                毕竟Java不支持多重继承这限制了Observable的复用潜力(而增加复用潜力不正是我们使用模式最原始的动机吗?)
            再者，因为没有0bservable接口，所以你无法建立自己的实现和Java内置的ObserverAPI搭配使用，
            也无法将javautil的实现换成另一套做法的实现(比方说
            Observable将关键的方法保护起来
            如果你看看bservableAPI，你会发现setChanged(方法被保护起来了《被定义成protected)。那又怎么样呢?这意味着:除非你继承自0bservable，否则你无法创建Observable实例并组合到你自己的对象中来。
            这个设计违反了第二个设计原则:“多用组合，少用继承”
            */
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
