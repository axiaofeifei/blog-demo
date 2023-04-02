package structure.adapter_test.head;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/5 15:39
 */
public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("fly ... ");
    }

    @Override
    public void quack() {
        System.out.println("quack ...");
    }
}
