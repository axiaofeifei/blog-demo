package uuid;

import java.util.UUID;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 13:34
 */
public class UUIDUtils {

    public String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public String getUUID2() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

    public String getUUID(int num) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0,num);
        return uuid;
    }


    public String getUpperUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        return uuid;
    }
}
