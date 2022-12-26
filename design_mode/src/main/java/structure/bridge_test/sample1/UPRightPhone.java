package structure.bridge_test.sample1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 8:55
 */
public class UPRightPhone extends Phone{

    private Brand brand;

    public UPRightPhone(Brand brand) {
        super(brand);
        this.brand = brand;
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立式手机开机...");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立式手机关机...");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立式手机呼叫...");
    }
}
