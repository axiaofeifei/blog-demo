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
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulate:with Goose Adapter...");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
    }

    void simulate(Quackable duck){
        duck.quack();
    }

}
