package structure.combination.sample_4.iterator;



import structure.combination.sample_4.package_1.Menu;
import structure.combination.sample_4.package_1.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 17:25
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }


    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
               stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
