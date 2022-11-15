package test.eightbasic;

import java.text.DecimalFormat;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/3 13:37
 */
public class BasicDataTest {
    public static void main(String[] args) {
        float  f = 1.11000F;
        double d = 1.11000;

        System.out.println("f = " + f);
        System.out.println("d = " + d);
        // 第一种  double数据类型保留三位小数
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        String format_1_f = decimalFormat.format(f);
        String format_1_d = decimalFormat.format(d);

        System.out.println("format_1_f = " + format_1_f);
        System.out.println("format_1_d = " + format_1_d);


        // 第二种 double数据类型保留三位小数
        float  floatNum = 2.22000F;
        double doubleNum = 2.22000;
        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);
        String format_2_f = String.format("%.3f", floatNum);
        String format_2_d = String.format("%.3f", doubleNum);

        System.out.println("format_2_f = " + format_2_f);
        System.out.println("format_2_d = " + format_2_d);


        


    }



}
