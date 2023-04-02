package behavior.strategy.sample_3.ihavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 14:47
 */
public class FlyWithWings implements FlyHavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
