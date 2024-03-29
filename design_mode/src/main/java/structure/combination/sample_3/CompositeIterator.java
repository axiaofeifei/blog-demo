package structure.combination.sample_3;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 17:25
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }

        Iterator iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }

        return true;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                Iterator menuIterator = component.createIterator();
                if (!stack.contains(menuIterator)) {
                    stack.push(menuIterator);
                }
            }
            return component;
        }

        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
