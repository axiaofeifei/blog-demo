package structure.decorator.coffee;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:16
 */
public class HouseBlend extends Beverage {

    public HouseBlend (){
        description ="House Blend Coffee";
    }
    public double cost() {
        return  0.45;
    }
}
