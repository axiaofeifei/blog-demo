package creator.simplefactory.simple_2.pizza_type.chicago;

import creator.simplefactory.simple_2.pizza_type.Pizza;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:56
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name="Chicago Cheese Pizza";
        dough ="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("chicago  的  pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizzainto square slices");
    }
}
