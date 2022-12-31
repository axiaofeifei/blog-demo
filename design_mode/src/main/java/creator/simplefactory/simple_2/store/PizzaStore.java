package creator.simplefactory.simple_2.store;

import creator.simplefactory.simple_2.pizza_type.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:04
 */
public abstract class PizzaStore {

    abstract  Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
