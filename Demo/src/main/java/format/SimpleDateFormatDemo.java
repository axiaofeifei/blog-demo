package test.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/12 21:17
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //格式化日期
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        System.out.println("------------------");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat2.format(date));


    }
}
