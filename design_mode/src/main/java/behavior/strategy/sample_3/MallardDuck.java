package behavior.strategy.sample_3;

import behavior.strategy.sample_3.ihavior.FlyWithWings;
import behavior.strategy.sample_3.ihavior.Quack;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 15:31
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackHavior = new Quack();
        flyHavior = new FlyWithWings();
    }

    @Override
    void swim() {
        System.out.println("绿头鸭游泳...");
    }

    @Override
    void display() {
        System.out.println("这是绿头鸭...");
    }

    public void perfermQuack(){
        quackHavior.quack();
    }

    public void perfermFly(){
        flyHavior.fly();
    }
}
