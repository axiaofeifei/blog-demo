package test.uuid;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/14 9:00
 */
public class UUIDTest {

    public static void main(String[] args) {
        UUIDUtils uuidUtils = new UUIDUtils();

        //未写replace("-","")的
        System.out.println("未写replace(\"-\",\"\")的:");
        System.out.println(uuidUtils.getUUID());

        //写了replace("-","")的  32位
        System.out.println("写了replace(\"-\",\"\")的,32位随机数:");
        System.out.println(uuidUtils.getUUID2());

        System.out.println("uuidUtils.getUUID(10) = " + uuidUtils.getUUID(10));

        System.out.println("uuidUtils.getUpperUUID() = " + uuidUtils.getUpperUUID());
    }
}
