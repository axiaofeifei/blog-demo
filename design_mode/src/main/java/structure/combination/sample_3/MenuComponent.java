package structure.combination.sample_3;

import java.util.Iterator;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 16:25
 */
public abstract class MenuComponent {


    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public MenuComponent getChild(int childIndex) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    //------------组合方法：新增，删除，取得组件-------------

    public String getName() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void print() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }


    public abstract Iterator<MenuComponent> createIterator();
}

