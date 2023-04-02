package behavior.strategy.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:54
 */
public class RubberDuck extends Duck{
    @Override
    void quack() {
        System.out.println("橡皮鸭吱吱的叫");
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
    void fly() {
    //  橡皮鸭不会飞,这里什么也不做

    }
}
