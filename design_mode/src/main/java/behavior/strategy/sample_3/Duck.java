package behavior.strategy.sample_3;

import behavior.strategy.sample_3.ihavior.FlyHavior;
import behavior.strategy.sample_3.ihavior.QuackHavior;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 13:42
 */
//策略模式第三个案例，这里我们用flyable接口和quackable接口实现飞行和叫功能
//               并且设计飞行类和不同的叫类来实现接口
//               如果这个鸭子会飞就实现flyable的接口,会叫就实现quackable的接口
//
//感觉和桥接模式很像啊,两个维度,不同的鸭子,不同的行为.这边的行为是从鸭子中抽出来的
//    桥接模式的两个维度是两个完全无关的维度
public abstract class Duck {

    //叫的接口
    protected QuackHavior quackHavior;
    //飞翔的接口
    protected FlyHavior flyHavior;

    public void setQuackHavior(QuackHavior quackHavior) {
        this.quackHavior = quackHavior;
    }

    public void setFlyHavior(FlyHavior flyHavior) {
        this.flyHavior = flyHavior;
    }

    public Duck() {
    }

    abstract void swim();

    abstract void display();

    public void perfermQuack(){
        quackHavior.quack();
    }

    public void perfermFly(){
        flyHavior.fly();
    }


}
