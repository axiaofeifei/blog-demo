package structure.bridge_test.sample1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 8:39
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开机...");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关闭...");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话...");
    }
}
