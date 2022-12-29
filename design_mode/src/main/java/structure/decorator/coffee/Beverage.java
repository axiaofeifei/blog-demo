package structure.decorator.coffee;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:08
 */
public abstract class Beverage {

    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
