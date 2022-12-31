package creator.simplefactory.simple_2.factory;

import creator.simplefactory.simple_2.pizza_type.*;
import creator.simplefactory.simple_2.pizza_type.chicago.ChicagoCheesePizza;
import creator.simplefactory.simple_2.pizza_type.chicago.ChicagoClamPizza;
import creator.simplefactory.simple_2.pizza_type.chicago.ChicagoPepperonPizza;
import creator.simplefactory.simple_2.pizza_type.chicago.ChicagoViggiePizza;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 15:22
 */
public class ChicagoPizzaFactory {
    Pizza pizza = null;
    public Pizza createPizza(String type){
        String Ptype = type.toLowerCase();
        if (Ptype.equals("cheese")){
            pizza = new ChicagoCheesePizza();
        }else if (Ptype.equals("clam")){
            pizza = new ChicagoClamPizza();
        }else if (Ptype.equals("pepperon")){
            pizza = new ChicagoPepperonPizza();
        }else if (Ptype.equals("viggie")){
            pizza = new ChicagoViggiePizza();
        }


        return pizza;
    }
}
