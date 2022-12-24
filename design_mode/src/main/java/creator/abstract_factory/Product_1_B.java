package creator.abstract_factory;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:33
 */
public class Product_1_B implements IProduct_1{

    @Override
    public void sang() {
        System.out.println("Product_1_B开始sang");
    }

    @Override
    public void tele() {
        System.out.println("Product_1_B开始tele");
    }
}
