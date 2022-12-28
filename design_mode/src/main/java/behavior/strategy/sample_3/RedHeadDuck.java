package behavior.strategy.sample_3;


import behavior.strategy.sample_3.ihavior.FlyWithWings;
import behavior.strategy.sample_3.ihavior.Quack;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:46
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyHavior = new FlyWithWings();
        quackHavior = new Quack();
    }

    @Override
    void swim() {
        System.out.println("红头鸭游泳");

    }

    @Override
    void display() {
        System.out.println("这是红头鸭");
    }

    @Override
    public void perfermQuack() {
        super.perfermQuack();
    }

    @Override
    public void perfermFly() {
        super.perfermFly();
    }
}
