package composite.simple_3;

import composite.interface_1.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/10 9:47
 */
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
