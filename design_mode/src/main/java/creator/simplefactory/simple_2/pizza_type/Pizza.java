package creator.simplefactory.simple_2.pizza_type;

import org.springframework.objenesis.instantiator.perc.PercInstantiator;

import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 14:53
 */
public abstract class Pizza {

     protected String name;

     protected String dough;

     protected String sauce;

     protected ArrayList toppings = new ArrayList();


    public void prepare(){

        System.out.println("Preparing w+name");
        System.out.println("Adding dough");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");
        for (int i=0;i < toppings.size();i++) {
            System.out.println("     "+toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");

    }

    public void cut(){
        System.out.println("Cutting the pizzainto diagonal slices");
    }

    public void box(){
        System.out.println("place pizzain official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
