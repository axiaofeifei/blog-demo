package structure.bridge_test.sample2;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:41
 */
public class Test_Bridge2 {

    @Test
    public void test(){
        LinuxPlatform linuxPlatform = new LinuxPlatform(new MP4Vedio());
        Vedio vedio = linuxPlatform.openVedio();
        vedio.showVedio();

        System.out.println("---------------------------------------------");

        LinuxPlatform linuxPlatform1 = new LinuxPlatform(new FlvVedio());
        Vedio vedio1 = linuxPlatform1.openVedio();
        vedio1.showVedio();

        System.out.println("---------------------------------------------");

        AndroidPlatform androidPlatform = new AndroidPlatform(new MP4Vedio());
        Vedio vedio2 = androidPlatform.openVedio();
        vedio2.showVedio();
    }
}
