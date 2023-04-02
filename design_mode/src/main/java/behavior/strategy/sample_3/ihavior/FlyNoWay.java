package behavior.strategy.sample_3.ihavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 14:52
 */
public class FlyNoWay implements FlyHavior {
    @Override
    public void fly() {
        System.out.println("不会飞啊");
    }
}
