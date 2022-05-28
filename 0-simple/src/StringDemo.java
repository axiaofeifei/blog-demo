import sun.text.resources.cldr.bn.FormatData_bn_IN;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/11 17:31
 */
public class StringDemo {
    public static void main(String[] args) {


        String test = "zui hou bu zhi tian zai shui , man chuan qing meng ya xing he";
        String[] split = test.split("\\s");
        for (String result : split) {
            System.out.println(result);
        }
        String test2 = "zui 3hou bu zhi tian zai shui man chuan qing meng ya xing he";
        System.out.println("-----------------");
//      碰到非字母数字的字符换行
        String[] split2 = test2.split("\\s*,\\s*");
        for (String result2 : split2) {
            System.out.println(result2);
        }

    }
}
