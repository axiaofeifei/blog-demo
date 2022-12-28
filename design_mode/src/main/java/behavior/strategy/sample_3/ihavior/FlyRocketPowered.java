package behavior.strategy.sample_3.ihavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 15:59
 */
public class FlyRocketPowered implements FlyHavior {
    @Override
    public void fly() {
        System.out.println("火箭动力飞行...");
    }
}
