package creator.factory_method;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 11:09
 */
public class ProductA implements Product{

    @Override
    public void show() {
        System.out.println("具体产品A");
    }
}
