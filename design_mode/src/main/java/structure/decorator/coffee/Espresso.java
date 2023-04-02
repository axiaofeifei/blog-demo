package structure.decorator.coffee;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:15
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
