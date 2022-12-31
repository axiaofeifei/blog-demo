package creator.singleton.simple_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */
//通过调用静态方法，创建对象。
public class SingletonClass {
    //私有的构造方法。
    private SingletonClass(){
        System.out.println("创建一个单例");
    };
    //公开的静态方法。
    public static SingletonClass getInstance(){
        return new SingletonClass();
    }
}
