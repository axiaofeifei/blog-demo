package creator.singleton.simple_3;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */
//多线程情况下getInstance()方法使用synchronized修饰
//    这样最安全但是效率最低，，，不考虑性能的情况下可以使用。
public class SingletonClass_3 {

    private static SingletonClass_3 uniqueInstance;


    private SingletonClass_3(){
        System.out.println("创建一个单例");
    };

    //使用线程锁
    public static synchronized SingletonClass_3 getInstance(){

        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClass_3();
        }
        return uniqueInstance;
    }
}
