package composite.factory;

import composite.QuackCounter;
import composite.duck.DuckCall;
import composite.duck.MallardDuck;
import composite.duck.RedheadDuck;
import composite.duck.RubberDuck;
import composite.interface_1.Quackable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 9:32
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
