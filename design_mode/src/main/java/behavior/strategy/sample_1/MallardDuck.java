package behavior.strategy.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:45
 */
public class MallardDuck extends Duck{
    @Override
    void quack() {
        System.out.println("绿头鸭叫");

    }

    @Override
    void swim() {
        System.out.println("绿头鸭游泳");

    }

    @Override
    void display() {
        System.out.println("这是绿头鸭");
    }

    @Override
    void fly() {
        System.out.println("绿头鸭飞");
    }
}
