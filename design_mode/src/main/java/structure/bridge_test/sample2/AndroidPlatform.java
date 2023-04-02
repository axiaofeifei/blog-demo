package structure.bridge_test.sample2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:37
 */
public class AndroidPlatform extends Platform {
    public AndroidPlatform(Vedio account) {
        super(account);
    }

    @Override
    Vedio openVedio() {
        System.out.println("在android平台播放视频...");
        return account;
    }
}
