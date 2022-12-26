package structure.bridge_test.sample2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:28
 */
public abstract class Platform {
    /**
     * 这是桥接模式最核心的代码
     *      在 Platform 中通过组合方式关联 Vedio
     *      Platform 的子类也可以关联 Vedio 子类
     */
    protected Vedio account;

    public Platform(Vedio account) {
        this.account = account;
    }

    /**
     * 该方法与 Vedio 中的方法名相同
     *      方法名相同不是强制的
     * @return
     */
    abstract Vedio openVedio();

}
