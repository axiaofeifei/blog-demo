package creator.abstract_factory;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:32
 */
public class Product_1_A implements IProduct_1{
    @Override
    public void sang() {
        System.out.println("Product_1_A开始sang");
    }

    @Override
    public void tele() {
        System.out.println("Product_1_A开始tele");
    }
}
