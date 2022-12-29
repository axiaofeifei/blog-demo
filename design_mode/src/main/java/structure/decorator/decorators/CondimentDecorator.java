package structure.decorator.decorators;

import structure.decorator.coffee.Beverage;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:10
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract double cost();
}
