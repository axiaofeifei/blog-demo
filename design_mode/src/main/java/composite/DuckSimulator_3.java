package composite;

import composite.factory.AbstractDuckFactory;
import composite.factory.CountingDuckFactory;
import composite.goose.Goose;
import composite.goose.GooseAdapter;
import composite.interface_1.Quackable;
import structure.adapter_test.head.Duck;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 9:35
 */
public class DuckSimulator_3 {
    public static void main(String[] args) {
        DuckSimulator_3 duckSimulator_3 = new DuckSimulator_3();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator_3.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator:With Abstract Factory");
        
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " Times");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
