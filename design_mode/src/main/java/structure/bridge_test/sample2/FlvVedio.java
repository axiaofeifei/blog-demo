package structure.bridge_test.sample2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:23
 */
public class FlvVedio implements Vedio{
    @Override
    public Vedio openVedio() {
        System.out.println("打开 FLV 格式视频");
        return new FlvVedio();
    }

    @Override
    public void showVedio() {
        System.out.println("当前视频格式是FLv");
    }
}
