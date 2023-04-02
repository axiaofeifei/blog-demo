package structure.adapter_test.classadapter;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 15:46
 */
public class Test_adapter {

    @Test
    public void test(){
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();
    }
}
