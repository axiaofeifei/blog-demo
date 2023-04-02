/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:53
 */

package status.sample_2.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
