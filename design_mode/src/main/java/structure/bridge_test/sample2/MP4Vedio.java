package structure.bridge_test.sample2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:25
 */
public class MP4Vedio implements Vedio{
    @Override
    public Vedio openVedio() {
        System.out.println("打开 mp4 格式视频");
        return new MP4Vedio();
    }

    @Override
    public void showVedio() {
        System.out.println("当前的视频格式是mp4");
    }
}
