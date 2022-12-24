package creator.factory_method;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:13
 */
public class Test_factory_method {

    @Test
    public void test(){
        //只能够通过工厂获取商品
        ProductFactoryA productFactoryA = new ProductFactoryA();
        Product productA = productFactoryA.manufacture();
        productA.show();

        ProductFactoryB productFactoryB = new ProductFactoryB();
        Product productB = productFactoryB.manufacture();
        productB.show();


    }
}
