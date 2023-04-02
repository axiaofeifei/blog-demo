/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 17:13
 */

package behavior.observer.sample_1;

public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
