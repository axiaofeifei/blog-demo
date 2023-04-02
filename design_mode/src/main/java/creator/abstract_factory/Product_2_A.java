package creator.abstract_factory;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:37
 */
public class Product_2_A implements IProduct_2 {
    @Override
    public void tell() {
        System.out.println("Product_2_A开始tell");
    }

    @Override
    public void run() {
        System.out.println("Product_2_A开始run");
    }
}
