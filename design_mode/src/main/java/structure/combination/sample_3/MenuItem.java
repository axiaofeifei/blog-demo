package structure.combination.sample_3;

import java.util.Iterator;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 16:28
 */
public class MenuItem extends MenuComponent {

    private String name = null;
    private String desc = null;
    private boolean vegetarian = false;
    private double price = 0.0d;

    public MenuItem(String _name, String _desc, boolean _vegetarian, double _price) {
        this.name = _name;
        this.desc = _desc;
        this.vegetarian = _vegetarian;
        this.price = _price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

/*    @Override
    public void print() {
        System.out.println("MenuItem: { " + name + ", " + desc + ", " + vegetarian + ", " + price + " }");
    }*/

    @Override
    public void print() {
        System.out.print(" "+getName());
        if (isVegetarian()) {
            System.out.print("v");
        }
        System.out.print(","+getPrice());
        System.out.println("  --"+getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

}
