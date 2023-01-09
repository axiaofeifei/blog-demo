package structure.adapter_test.head;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/5 15:46
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble...");
    }

    @Override
    public void fly() {
        System.out.println("Fly fly...");
    }
}
