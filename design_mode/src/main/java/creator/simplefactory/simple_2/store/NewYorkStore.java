package creator.simplefactory.simple_2.store;


import creator.simplefactory.simple_2.factory.NewYorkPizzaFactory;
import creator.simplefactory.simple_2.pizza_type.Pizza;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:28
 */
public class NewYorkStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = new NewYorkPizzaFactory().createPizza(type);

        return pizza;
    }
}
