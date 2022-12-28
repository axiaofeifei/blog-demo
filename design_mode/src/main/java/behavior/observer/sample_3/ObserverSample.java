package behavior.observer.sample_3;

import behavior.observer.sample_3.util.SelfObservable;
import behavior.observer.sample_3.util.SelfObserver;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 11:16
 */
public class ObserverSample implements SelfObserver {

    private SelfObservable selfObservable;

    private String name;

    private String age;

    public ObserverSample(SelfObservable selfObservable) {
        this.selfObservable = selfObservable;
        selfObservable.addObserver(this);
    }

    @Override
    public void update(SelfObservable o, Object arg) {
        if (o instanceof SubjectSample){
            SubjectSample weatherData = (SubjectSample) o;
            this.name = weatherData.getName();
            this.age = weatherData.getAge();
            display();
        }
    }

    public void display() {
        System.out.println("当前的名字："+name+"最近的年龄："+age);
    }

}
