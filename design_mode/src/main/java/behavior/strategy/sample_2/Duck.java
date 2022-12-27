package behavior.strategy.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:42
 */
//策略模式第二个案例，这里我们用flyable接口和quackable接口实现飞行和叫功能
//               如果这个鸭子会飞就实现flyable的接口,会叫就实现quackable的接口
//

public abstract class Duck {


    abstract void swim();

    abstract void display();



}
