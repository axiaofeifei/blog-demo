package structure.bridge_test.sample1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 8:36
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机:");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机:");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机:");

    }
}
