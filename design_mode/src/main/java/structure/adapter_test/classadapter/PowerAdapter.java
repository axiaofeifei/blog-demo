package structure.adapter_test.classadapter;

import structure.adapter_test.objectadapter.AC220;
import structure.adapter_test.objectadapter.DC5;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 15:44
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;

    }
}
