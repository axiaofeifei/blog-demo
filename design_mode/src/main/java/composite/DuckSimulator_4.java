package composite;

import composite.factory.AbstractDuckFactory;
import composite.factory.CountingDuckFactory;
import composite.goose.Goose;
import composite.goose.GooseAdapter;
import composite.interface_1.Quackable;
import composite.simple_3.Flock;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 10:01
 */
public class DuckSimulator_4 {
    public static void main(String[] args) {
        DuckSimulator_4 duckSimulator_4 = new DuckSimulator_4();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator_4.simulator(duckFactory);
    }



    void simulator(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\n Duck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation...");
        simulator(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation...");
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
