/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/15 10:39
 */
public class Test {
    public static void main(String[] args) {


        String str1 = "10000001"; // 需要验证的字符
        String regex1 = "^(((\\d{1,7})(?:|([.]{1})((\\d{1,2}))))|1000000)$"; // 正则表达式  2位数字
        System.out.println(str1.matches(regex1)); // true
    }
}
