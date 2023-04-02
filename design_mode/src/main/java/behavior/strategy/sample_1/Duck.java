package behavior.strategy.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:42
 */
//策略模式第一个案例，这是没有经过策略模式改善的类型
//    在sample_2和sample_3中分别会对其进行改进
//    现在需要给鸭子们添加一个新的行为,fly()
//    如果直接在超类Duck中添加,那么所有的子类都需要添加fly()方法
//    很明显我们有些橡皮鸭,洗澡鸭不会游泳.这样就要把他们重写很费劲
public abstract class Duck {
    abstract void  quack();

    abstract void swim();

    abstract void display();

//    我们在超类duck中添加fly()方法
    abstract void fly();

}
