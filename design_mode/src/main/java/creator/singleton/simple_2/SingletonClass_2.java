package creator.singleton.simple_2;

import creator.singleton.simple_1.SingletonClass;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 13:05
 */
public class SingletonClass_2 {

    private static SingletonClass_2 uniqueInstance;


    private SingletonClass_2(){
        System.out.println("创建一个单例");
    };

    public static SingletonClass_2 getInstance(){

        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClass_2();
        }
        return uniqueInstance;
    }
}
