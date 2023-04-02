package behavior.observer.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:09
 */
//观察者模式有两部分组成:主题  --  观察者
//    分别都有各自的接口,当观察姐
public interface Subject {
    public void registerbserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
