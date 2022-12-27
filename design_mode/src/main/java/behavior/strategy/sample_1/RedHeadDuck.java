package behavior.strategy.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:46
 */
public class RedHeadDuck extends Duck{
    @Override
    void quack() {
        System.out.println("红头鸭叫");

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
    void fly() {
        System.out.println("红头鸭飞");
    }
}
