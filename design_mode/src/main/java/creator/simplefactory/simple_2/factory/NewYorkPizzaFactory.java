package creator.simplefactory.simple_2.factory;

import creator.simplefactory.simple_2.pizza_type.*;
import creator.simplefactory.simple_2.pizza_type.newyork.NewYorkCheesePizza;
import creator.simplefactory.simple_2.pizza_type.newyork.NewYorkClamPizza;
import creator.simplefactory.simple_2.pizza_type.newyork.NewYorkPepperonPizza;
import creator.simplefactory.simple_2.pizza_type.newyork.NewYorkViggiePizza;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:21
 */
public class NewYorkPizzaFactory {
    Pizza pizza = null;



    public Pizza createPizza(String type){
        String Ptype = type.toLowerCase();
        if (Ptype.equals("cheese")){
            pizza = new NewYorkCheesePizza();
        }else if (Ptype.equals("clam")){
            pizza = new NewYorkClamPizza();
        }else if (Ptype.equals("pepperon")){
            pizza = new NewYorkPepperonPizza();
        }else if (Ptype.equals("viggie")){
            pizza = new NewYorkViggiePizza();
        }


        return pizza;
    }
}
