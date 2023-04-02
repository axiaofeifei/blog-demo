package creator.abstract_factory;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 13:35
 */
public class Test_Abstract_factory {

    @Test
    public void test(){
    //    从工厂中获取产品
        ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();
        IProduct_1 product_1 = concreteFactoryA.createProduct_1();
        product_1.sang();

        ConcreteFactoryB concreteFactoryB = new ConcreteFactoryB();
        IProduct_2 product_2 = concreteFactoryB.createProduct_2();
        product_2.run();


    }
}
