/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 11:04
 */

package behavior.observer.sample_3.util;

//自己的观察者接口
//因为java api的观察者接口中的update方法用的是Observable
//这里写成自己的SelfObservable
public interface SelfObserver {
    void update(SelfObservable o, Object arg);
}
