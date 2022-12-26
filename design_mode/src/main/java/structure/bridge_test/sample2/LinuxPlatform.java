package structure.bridge_test.sample2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:32
 */
public class LinuxPlatform extends Platform{

    public LinuxPlatform(Vedio account) {
        super(account);
    }

    @Override
    Vedio openVedio() {
        System.out.println("在linux平台播放视频...");
        return account;
    }
}
