package creator.singleton.simple_4;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */
//多线程情况下getInstance()方法

public class SingletonClass_5 {
//静态志方式饿汉式单例，
    private static final SingletonClass_5 hungrySingleton ;
    static {
        hungrySingleton = new SingletonClass_5();
    }

    /**
     * 私有构造
     */
    private SingletonClass_5() {}

    //取实例方法
    public static SingletonClass_5 getInstance() {
        return hungrySingleton;
    }

}
