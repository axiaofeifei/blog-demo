package composite.factory;


import composite.duck.DuckCall;
import composite.duck.MallardDuck;
import composite.duck.RedheadDuck;
import composite.duck.RubberDuck;
import composite.interface_1.Quackable;


/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 9:07
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {

        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
