package creator.factory_method;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:11
 */
public class ProductFactoryA implements ProductFactory{
    @Override
    public Product manufacture() {
        System.out.println("A工厂，生产产品A");
        return new ProductA();
    }
}
