package structure.decorator;

import org.junit.Test;
import structure.decorator.coffee.Beverage;
import structure.decorator.coffee.Espresso;
import structure.decorator.coffee.HouseBlend;
import structure.decorator.decorators.Mocha;
import structure.decorator.decorators.Soy;
import structure.decorator.decorators.Whip;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/28 15:33
 */
//抽象类beverage,具体的coffer种类继承beverage
//    抽象装饰类CondimentDecorator，有cost()方法，具体的Mocha,Soy,Whip装饰
public class Test_3 {

    @Test
    public void test(){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+"价格"+espresso.cost());

        Beverage espresso1 = new Espresso();
        espresso1 = new Mocha(espresso1);
        espresso1 = new Soy(espresso1);
        System.out.println(espresso1.getDescription()+"价格"+espresso1.cost());


        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        new Soy(houseBlend);
        new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()+"价格"+houseBlend.cost());




    }
}
