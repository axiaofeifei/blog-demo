package date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 14:56
 */
public class LocalDateMethodSample {

    /**
     * LocalDate的常用使用方法
     * 此处单元测试的注解是采用:org.junit.Test
     */
    @Test
    public void usage() {
        //此处采用LocalDate对象直接调用now(),获取到当前日期,注意：如果使用我的实例，结果会不一样，因为LocalDate.now()是调用时的日期
        LocalDate currentDate = LocalDate.now();
        //1.获取年、月、日、星期几、月中天、年中天、月数
        System.out.println("------------------1.获取年、月、日、星期几、月中天、年中天、月数-----------------------");
        System.out.println("1.获取当前日期：" + currentDate);
        System.out.println("1.获取当前日期的年：" + currentDate.getYear());
        System.out.println("1.获取当前日期的月：" + currentDate.getMonthValue());
        System.out.println("1.获取当前日期是一年的第多少天：" + currentDate.getDayOfYear());
        System.out.println("1.获取当前日期是一月中的哪一天：" + currentDate.getDayOfMonth());
        System.out.println("1.获取当前日期是一周中的星期几：" + currentDate.getDayOfWeek().getValue());
        System.out.println("1.获取到的年有多少天：" + currentDate.lengthOfYear());
        System.out.println("1.获取到的年有多少月：" + currentDate.lengthOfMonth());


        //2.时间的计算
        System.out.println("-----------------2.时间的计算,主要是加减法------------------------");
        System.out.println("2.获取到的当前日期：" + currentDate);
        System.out.println("2.加法，当前日期上加2年：" + currentDate.plusYears(2));
        System.out.println("2.加法，当前日期上加3个月：" + currentDate.plusMonths(3));
        System.out.println("2.加法，当前日期上加20天：" + currentDate.plusDays(20));
        System.out.println("2.加法，当前日期上加一周：" + currentDate.plusWeeks(1));
        System.out.println("2.减法，当前日期上减2年：" + currentDate.minusYears(2));
        System.out.println("2.减法，当前日期上减3个月：" + currentDate.minusMonths(3));
        System.out.println("2.减法，当前日期上减20天：" + currentDate.minusDays(20));
        System.out.println("2.减法，当前日期上减一周：" + currentDate.minusWeeks(1));


        //3.时间的判断及转化
        System.out.println("-----------------3.时间的判断及格式化(格式化的类型很多)------------------------");
        //新建一个格式化类型
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        //新创建一个LocalDate日期进行比较
        LocalDate localDateOf = LocalDate.of(2020, 5, 20);
        System.out.println("3.当前日期转成yyyyMMdd型的字符串：" + currentDate.format(formatter));
        System.out.println("3.当前日期是否在一个日期之后：" + currentDate.isAfter(localDateOf));
        System.out.println("3.当前日期是否在一个日期之前：" + currentDate.isBefore(localDateOf));
        System.out.println("3.当前日期是否是闰年：" + currentDate.isLeapYear());
        System.out.println("3.2020-05-20是否是闰年：" + localDateOf.isLeapYear());

        //4.根据指定数据获取日期或者时间(LocalTime)
        System.out.println("-----------------4.根据指定数据获取日期或者时间(LocalTime)------------------------");
        System.out.println("4.获取到的当前日期：" + currentDate);
        System.out.println("4.修改年数为1999年：" + currentDate.withYear(1999));
        System.out.println("4.修改月数为10月：" + currentDate.withMonth(10));
        System.out.println("4.修改天数为当月12日：" + currentDate.withDayOfMonth(12));
        System.out.println("4.获取到的当前日期的开始时间：" + currentDate.atStartOfDay());
        System.out.println("4.根据指定的时、分、秒获取时间：" + currentDate.atTime(12, 23, 45));
        System.out.println("4.根据时间LocalTime对象获取时间：" + currentDate.atTime(LocalTime.now()));
    }
}
