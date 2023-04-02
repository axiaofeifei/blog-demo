package behavior.strategy.sample_3;

import behavior.strategy.sample_3.ihavior.FlyRocketPowered;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 15:46
 */
//策略模式将超类(抽象类)的行为  单独抽取出来声明为接口  并作为超类的属性,
// 并使用具体的类实现接口,形成功能类
//   超类的子类构造时,选择自己特定的功能类修饰自己继承的超类接口属性
public class Test_3 {

    @Test
    public void test(){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.perfermQuack();
        mallardDuck.perfermFly();
        System.out.println("-----------------------------------");
        Duck mallardDuck1 = new MallardDuck();
        mallardDuck1.display();
        mallardDuck1.quackHavior.quack();
        mallardDuck1.flyHavior.fly();

        mallardDuck1.perfermQuack();
        mallardDuck1.perfermFly();

        System.out.println("---------------------------------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.perfermFly();
        rubberDuck.perfermQuack();
        System.out.println("橡皮鸭改为火箭动力飞行...");
        rubberDuck.setFlyHavior(new FlyRocketPowered());
        rubberDuck.perfermFly();
    }
}
