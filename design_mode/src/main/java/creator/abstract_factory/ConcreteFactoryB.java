package creator.abstract_factory;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:30
 */
public class ConcreteFactoryB implements IAbstractFactory {

    @Override
    public IProduct_1 createProduct_1() {
        System.out.println("工厂B生产1号产品");
        return new Product_1_B();
    }

    @Override
    public IProduct_2 createProduct_2() {
        System.out.println("工厂A生产2号产品");
        return new Product_2_B();
    }
}
