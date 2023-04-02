package creator.singleton.simple_5;

import creator.singleton.simple_4.SingletonClass_5;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */
//多线程情况下getInstance()方法

public class SingletonClass_6 {
//静态志方式饿汉式单例，
    private volatile static SingletonClass_6 singleton ;

    public SingletonClass_6() {
    }

    public static SingletonClass_6 getInstance(){
        if (singleton == null) {
            synchronized (SingletonClass_6.class){
                if (singleton == null){
                    return new SingletonClass_6();
                }
            }
        }
        return singleton;
    }


}
