package methodTest;

import org.apache.commons.lang3.StringUtils;
/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/21 14:00
 */
public class IsBlankEmpty {
    public static void main(String[] args) {
        String test1 = "";
        String test2 = "   ";
        String test3 = new String();
        String test4 = null;
        String test5 = "\n";
        String test6 = "\t";

        String test7 = "a";


        //isEmpty()的测试
        System.out.println("----------------isEmpty()---------------");

        System.out.println("test1.isEmpty() = " + test1.isEmpty());
        System.out.println("test2.isEmpty() = " + test2.isEmpty());
        //报空指针异常
        //System.out.println("test3.isEmpty() = " + test3.isEmpty());
        //System.out.println("test4.isEmpty() = " + test4.isEmpty());
        System.out.println("test5.isEmpty() = " + test5.isEmpty());
        System.out.println("test6.isEmpty() = " + test6.isEmpty());
        System.out.println("test7.isEmpty() = " + test7.isEmpty());
        //StringUtils.iEmpty()的测试
        System.out.println("----------------StringUtils.isEmpty()---------------");

        System.out.println("test1.isEmpty() = " + StringUtils.isEmpty(test1));
        System.out.println("test2.isEmpty() = " + StringUtils.isEmpty(test2));
        System.out.println("test3.isEmpty() = " + StringUtils.isEmpty(test3));
        System.out.println("test4.isEmpty() = " + StringUtils.isEmpty(test4));
        System.out.println("test5.isEmpty() = " + StringUtils.isEmpty(test5));
        System.out.println("test6.isEmpty() = " + StringUtils.isEmpty(test6));
        System.out.println("test7.isEmpty() = " + StringUtils.isEmpty(test7));
        //StringUtils.isBlank()的测试
        System.out.println("----------------StringUtils.isBlank()----------------");
        System.out.println("test1.isEmpty() = " + StringUtils.isBlank(test1));
        System.out.println("test2.isEmpty() = " + StringUtils.isBlank(test2));
        System.out.println("test3.isEmpty() = " + StringUtils.isBlank(test3));
        System.out.println("test4.isEmpty() = " + StringUtils.isBlank(test4));
        System.out.println("test5.isEmpty() = " + StringUtils.isBlank(test5));
        System.out.println("test6.isEmpty() = " + StringUtils.isBlank(test6));
        System.out.println("test7.isEmpty() = " + StringUtils.isBlank(test7));


    }
}
