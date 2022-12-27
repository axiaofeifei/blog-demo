package behavior.strategy.sample_2;



/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:46
 */
public class RedHeadDuck extends Duck implements Flyable,Quackable{

    @Override
    void swim() {
        System.out.println("红头鸭游泳");

    }

    @Override
    void display() {
        System.out.println("这是红头鸭");
    }


    @Override
    public void fly() {
        System.out.println("红头鸭飞");
    }

    @Override
    public void quack() {
        System.out.println("红头鸭叫");
    }
}
