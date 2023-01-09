package composite.duck;

import composite.interface_1.Quackable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 18:13
 */
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
