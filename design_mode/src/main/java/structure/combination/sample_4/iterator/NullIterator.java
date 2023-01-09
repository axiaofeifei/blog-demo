package structure.combination.sample_4.iterator;





import structure.combination.sample_4.package_1.MenuComponent;

import java.util.Iterator;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 17:25
 */
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
