package creator.simplefactory.simple_1;

import creator.simplefactory.simple_1.pizza_type.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 14:56
 */
public class SimplePizzaFactory {
    Pizza pizza = null;
    public Pizza createPizza(String type){
        String Ptype = type.toLowerCase();
        if (Ptype.equals("cheese")){
            pizza = new CheesePizza();
        }else if (Ptype.equals("clam")){
            pizza = new ClamPizza();
        }else if (Ptype.equals("pepperon")){
            pizza = new PepperonPizza();
        }else if (Ptype.equals("clam")){
            pizza = new ViggiePizza();
        }


        return pizza;
    }
}
