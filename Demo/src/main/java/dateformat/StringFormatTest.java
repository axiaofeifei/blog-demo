package test.dateformat;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/3 9:33
 */
public class StringFormatTest {
    public static void main(String[] args) {
        // %s %c  字符串  字符
        String str;
        str = String.format("Hello %s%c","world",'!');
        System.out.println(str);
        //%b  布尔型
        str = String.format("%b", 10>3);
        System.out.println(str);
        str = String.format("%b", 2>=3);
        System.out.println(str);
        //%d %x %o  十进制  十六进制  八进制
        str = String.format("十进制：%d", 10);
        System.out.println(str);
        str = String.format("十六进制：%x", 10);
        System.out.println(str);
        str = String.format("八进制：%o", 10);
        System.out.println(str);
        //%f %a %g %e 浮点数  十六进制浮点数 通用浮点数 指数形式
        str = String.format("浮点数：%f", 3.14159);
        System.out.println(str);
        str = String.format("十六进制浮点数：%a", 3.14159);
        System.out.println(str);
        str = String.format("通用浮点类型：%g", 3.1415926);
        System.out.println(str);
        str = String.format("指数形式：%e", 3.14159);
        System.out.println(str);
        //%h %% %n 散列码  百分比  换行
        str = String.format("散列码：%h", "123456");
        System.out.println(str);
        str = String.format("百分之九十：%d%%", 90);
        System.out.println(str);
        str = String.format("测试到此结束！%n");
        System.out.println(str);


        //+号的用法
        str = String.format("数字的正负表示：%+d %d %+d %d",8,8,-8,-8);
        System.out.println(str);
        //-的用法
        str = String.format("-的用法，左对齐：%-6d",8);
        System.out.println(str);
        //0的用法
        str = String.format("0的用法，缺位补零：%06d",8);
        System.out.println(str);
        //' '空格的用法
        str = String.format("空格的用法，缺位补空格：% 6d",8);
        System.out.println(str);
        str = String.format("缺位补空格：% 6d",-8);
        System.out.println(str);
        //,的用法
        str = String.format("数字分组：%,d",123456789);
        System.out.println(str);
        //(的用法
        str = String.format("括号用法：%(d",-8888);
        System.out.println(str);
        str = String.format("括号用法：%(d",8888);
        System.out.println(str);
        //#的用法
        str = String.format("#括号用法(十六进制)：%#x",12);
        System.out.println(str);
        str = String.format("#括号用法(八进制)：%#o",12);
        System.out.println(str);
        //<的用法
        str = String.format("<括号用法：%f %<3.1f",3.14,3.2);
        //"%<3.1f"作用的对象是前一个"%f"所作用的对象
        System.out.println(str);



    }
}
