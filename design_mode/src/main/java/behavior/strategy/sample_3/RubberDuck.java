package behavior.strategy.sample_3;


import behavior.strategy.sample_3.ihavior.FlyNoWay;
import behavior.strategy.sample_3.ihavior.FlyWithWings;
import behavior.strategy.sample_3.ihavior.MuteQuack;
import behavior.strategy.sample_3.ihavior.Quack;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:54
 */
//橡皮鸭子不会飞也不会叫就用不会叫和不会飞的类

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyHavior = new FlyNoWay();
        quackHavior = new MuteQuack();
    }

    @Override
    void swim() {
        System.out.println("橡皮鸭不会游泳");
    }

    @Override
    void display() {
        System.out.println("这是一只橡皮鸭");
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
