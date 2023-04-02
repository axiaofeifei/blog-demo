package creator.simplefactory.simple_2;

import creator.simplefactory.simple_2.pizza_type.Pizza;
import creator.simplefactory.simple_2.store.ChicagoStore;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:07
 */
public class Test_1 {

    @Test
    public void test(){

        //PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        //Pizza cheese = pizzaStore.orderPizza("cheese");

        ChicagoStore chicagoStore = new ChicagoStore();
        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("--------------------------------");
        System.out.println(pizza.getName());

    }
}
