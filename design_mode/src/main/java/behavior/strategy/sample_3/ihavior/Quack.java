package behavior.strategy.sample_3.ihavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 15:14
 */
public class Quack implements QuackHavior{
    @Override
    public void quack() {
        System.out.println("呱呱叫...");
    }
}
