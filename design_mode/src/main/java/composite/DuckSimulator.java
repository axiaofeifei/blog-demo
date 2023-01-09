package composite;

import composite.duck.DuckCall;
import composite.duck.MallardDuck;
import composite.duck.RedheadDuck;
import composite.duck.RubberDuck;
import composite.interface_1.Quackable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 18:28
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
    }
}
