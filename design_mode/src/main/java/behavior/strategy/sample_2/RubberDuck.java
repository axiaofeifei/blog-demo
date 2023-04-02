package behavior.strategy.sample_2;



/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:54
 */
//橡皮鸭子不会飞也不会叫就不实现Flyable和Quackable接口了
public class RubberDuck extends Duck {

    @Override
    void swim() {
        System.out.println("橡皮鸭不会游泳");
    }

    @Override
    void display() {
        System.out.println("这是一只橡皮鸭");
    }


}
