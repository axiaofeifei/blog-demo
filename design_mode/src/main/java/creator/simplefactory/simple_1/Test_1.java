import creator.simplefactory.simple_1.PizzaStore;
import creator.simplefactory.simple_1.SimplePizzaFactory;
import creator.simplefactory.simple_1.pizza_type.Pizza;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:07
 */
public class Test_1 {

    @Test
    public void test(){

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheese = pizzaStore.orderPizza("cheese");


    }
}
