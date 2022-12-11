package date.local;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 15:51
 */
public class LocalDateTimeMethodDemo {
    /**
     * LocalDateTime的常用使用方法
     * 此处单元测试的注解是采用:org.junit.Test
     */
    @Test
    public void usage() {
        //1.根据LocalDateTime获取LocalDate
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("1.根据LocalDateTime获取LocalDate: " + currentTime.toLocalDate());
        //2.根据LocalDateTime获取LocalTime
        System.out.println("2.根据LocalDateTime获取LocalTime: " + currentTime.toLocalTime());


        System.out.println("------------------3.时间的加减法及修改-----------------------");
        //3.LocalDateTime的加减法包含了LocalDate和LocalTime的所有加减,上面说过,这里就只做简单介绍
        System.out.println("3.当前时间：" + currentTime);
        System.out.println("3.当前时间加5年：" + currentTime.plusYears(5));
        System.out.println("3.当前时间加2个月：" + currentTime.plusMonths(2));
        System.out.println("3.当前时间减2天：" + currentTime.minusDays(2));
        System.out.println("3.当前时间减5个小时：" + currentTime.minusHours(5));
        System.out.println("3.当前时间加5分钟：" + currentTime.plusMinutes(5));
        System.out.println("3.当前时间加20秒：" + currentTime.plusSeconds(20));
        //还可以灵活运用比如：向后加一年，向前减一天，向后加2个小时，向前减5分钟，可以进行连写
        System.out.println("3.同时修改(向后加一年，向前减一天，向后加2个小时，向前减5分钟)：" + currentTime.plusYears(1).minusDays(1).plusHours(2).minusMinutes(5));
        System.out.println("3.修改年为2025年：" + currentTime.withYear(2025));
        System.out.println("3.修改月为12月：" + currentTime.withMonth(12));
        System.out.println("3.修改日为27日：" + currentTime.withDayOfMonth(27));
        System.out.println("3.修改小时为12：" + currentTime.withHour(12));
        System.out.println("3.修改分钟为12：" + currentTime.withMinute(12));
        System.out.println("3.修改秒为12：" + currentTime.withSecond(12));


        System.out.println("------------------4.时间的转化及其他-----------------------");
        //4.时间的格式化及其他
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2020-09-18 14:55:44", formatter);
        System.out.println("4.时间字符串转为时间：" + parse);
        LocalDate localDate = LocalDate.now();
        System.out.println("4.所属年份的第一天：" + localDate.with(firstDayOfYear()));
        System.out.println("4.所属年份的最后一天：" + localDate.with(lastDayOfYear()));
        System.out.println("4.所属年份的下一年的第一天：" + localDate.with(firstDayOfNextYear()));
        System.out.println("4.所属月份的第一天：" + localDate.with(firstDayOfMonth()));
        System.out.println("4.所属月份的最后一天：" + localDate.with(lastDayOfMonth()));
        System.out.println("4.所属月份的下个月的第一天：" + localDate.with(firstDayOfNextMonth()));
    }
}
