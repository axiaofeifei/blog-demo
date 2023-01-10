package composite.goose;

import composite.goose.Goose;
import composite.interface_1.Quackable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 18:26
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
