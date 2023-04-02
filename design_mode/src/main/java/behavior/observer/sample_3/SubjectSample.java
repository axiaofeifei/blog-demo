package behavior.observer.sample_3;

import behavior.observer.sample_3.util.SelfObservable;
import behavior.observer.sample_3.util.SelfObserver;

import java.util.Vector;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 10:51
 */

//这就是自己以后写的主题的模板，按需求使用自己需要的方法。
public class SubjectSample implements SelfObservable {
    private boolean changed = false;
    private Vector<SelfObserver> obs;

    private String name;
    private String age;
    private String high;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHigh() {
        return high;
    }

    public SubjectSample() {
        obs = new Vector<>();
    }

    public void setMeasurements(String name, String age,String high){
        this.name= name;
        this.age=age;
        this.high= high;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        //通知的对象为null,所以我们我这里用的是拉的方式
        notifyObservers();
        //通知的对象存在,这里我们用的是推的方式
        //notifyObservers(new CurrentConditionsDisplay);
    }

    public synchronized void addObserver(SelfObserver o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    public synchronized void deleteObserver(SelfObserver o) {
        obs.removeElement(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {

        Object[] arrLocal;

        synchronized (this) {

            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((SelfObserver)arrLocal[i]).update(this, arg);
    }

    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    public synchronized void setChanged() {
        changed = true;
    }

    public synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    public synchronized int countObservers() {
        return obs.size();
    }
}
