package creator.singleton.simple_4;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */

public class SingletonClass_4 {

    //饿汉式单例线程
    private static SingletonClass_4 uniqueInstance = new SingletonClass_4();


    private SingletonClass_4(){
        System.out.println("创建一个单例");
    };

    //使用线程锁
    public static SingletonClass_4 getInstance(){
        return uniqueInstance;
    }
}
