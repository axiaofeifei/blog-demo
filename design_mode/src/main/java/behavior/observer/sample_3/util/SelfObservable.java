/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 10:45
 */

package behavior.observer.sample_3.util;

//写一个自己的主题接口SelfObservable
//不用java api自带的Observable超类,
//自己的主题实现SelfObservable接口,模仿超类写实现

public interface SelfObservable {


    public  void addObserver(SelfObserver o);

    public  void deleteObserver(SelfObserver o);

    public void notifyObservers();



    public void notifyObservers(Object arg);


    public  void deleteObservers();


     void setChanged();


     void clearChanged();



    public boolean hasChanged();


    public int countObservers();
}
