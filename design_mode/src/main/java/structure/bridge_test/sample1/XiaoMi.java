package structure.bridge_test.sample1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 8:41
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机...");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机...");
    }

    @Override
    public void call() {
        System.out.println("小米手机呼叫...");
    }
}
