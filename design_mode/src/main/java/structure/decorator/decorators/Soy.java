package structure.decorator.decorators;

import structure.decorator.coffee.Beverage;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:25
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    Double price = 0.34;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getBeverage() {
        return beverage.getDescription() + ",macha.";
    }

    @Override
    public double cost() {
        return beverage.cost()+price;
    }
}
