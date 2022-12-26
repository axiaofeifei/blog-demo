package structure.bridge_test.sample1;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 8:49
 */
public class Test_Bridge1 {

    @Test
    public void test(){
        FoldedPhone foldedPhone = new FoldedPhone(new Vivo());

        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
        System.out.println("-------------------------------------------");

        FoldedPhone foldedPhone1 = new FoldedPhone(new XiaoMi());

        foldedPhone1.open();
        foldedPhone1.close();

        System.out.println("-------------------------------------------");
        UPRightPhone upRightPhone = new UPRightPhone(new Vivo());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}
