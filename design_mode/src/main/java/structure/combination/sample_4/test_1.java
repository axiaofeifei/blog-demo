package structure.combination.sample_4;

import structure.combination.sample_1.Component;
import structure.combination.sample_4.iterator.CompositeIterator;
import structure.combination.sample_4.package_1.MenuComponent;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/7 10:48
 */
public class test_1 {
    public static void main(String[] args) {

    }

    public void testCompositeIterator(MenuComponent menuComponent){
        CompositeIterator iterator = new CompositeIterator(menuComponent.createIterator());

        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
        }
    }
}
