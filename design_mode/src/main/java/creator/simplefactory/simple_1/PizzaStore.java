package creator.simplefactory.simple_1;

import creator.simplefactory.simple_1.pizza_type.Pizza;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:04
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
