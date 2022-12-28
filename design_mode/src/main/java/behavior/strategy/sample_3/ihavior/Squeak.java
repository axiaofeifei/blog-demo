package behavior.strategy.sample_3.ihavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 15:16
 */
public class Squeak implements QuackHavior{
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫...");
    }
}
