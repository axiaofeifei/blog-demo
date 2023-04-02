package structure.adapter_test.head;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/5 15:48
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.gobble();
    }

    @Override
    public void quack() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
