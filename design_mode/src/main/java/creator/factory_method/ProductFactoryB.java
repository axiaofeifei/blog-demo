package creator.factory_method;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:12
 */
public class ProductFactoryB implements ProductFactory{
    @Override
    public Product manufacture() {
        System.out.println("B工厂，生产产品B:");
        return new ProductB();
    }
}
