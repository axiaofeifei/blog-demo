package creator.abstract_factory;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:24
 */
public class ConcreteFactoryA implements IAbstractFactory {

    @Override
    public IProduct_1 createProduct_1() {
        System.out.println("实体工厂A生产产品1");
        return new Product_1_A();
    }

    @Override
    public IProduct_2 createProduct_2() {
        System.out.println("实体工厂A生产产品2");
        return new Product_2_A();
    }
}
