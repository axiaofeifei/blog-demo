package composite;

import composite.duck.DuckCall;
import composite.duck.MallardDuck;
import composite.duck.RedheadDuck;
import composite.duck.RubberDuck;
import composite.goose.Goose;
import composite.goose.GooseAdapter;
import composite.interface_1.Quackable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 8:28
 */
public class DuckSimulator_2 {
    public static void main(String[] args) {
        DuckSimulator_2 duckSimulator = new DuckSimulator_2();
        duckSimulator.simulator();

    }

    private void simulator() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        //不会被计数
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck Simulator:With Decorator");

        simulator(mallardDuck);

        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(gooseDuck);

        System.out.println("The ducks quacked   " +
                QuackCounter.getQuacks()+"   times");

    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
