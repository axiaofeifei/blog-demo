package date;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 15:34
 */
public class LocalDateTimeDemo {
    /**
     * LocalDateTime的初始化方法
     * 此处单元测试的注解是采用:org.junit.Test
     */
    @Test
    public void test() {
        //1.LocalDateTime对象直接调用now(),获取到当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("1.LocalDateTime对象直接调用now()获取到的时间：" + localDateTime);
        //2.根据年月日时分秒构造（此处方法比较多，不一一介绍）
        LocalDateTime localDateTimeOf = LocalDateTime.of(2021, 5, 10, 18, 30, 26);
        System.out.println("2.根据年月日时分秒构造获取到的时间：" + localDateTimeOf);
        //3.根据LocalDate和LocalTime得到(在有日期和时间的情况下可以使用)
        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("3.根据LocalDate和LocalTime得到:" + of);
        //4.LocalDate指定一个LocalTime(LocalDate只有年月日)
        LocalTime localTimeInit = LocalTime.of(14, 25, 25);
        LocalDateTime localDateWithLocalTime = LocalDate.now().atTime(localTimeInit);
        System.out.println("4.LocalDate指定一个LocalTime:" + localDateWithLocalTime);
        //5.LocalTime指定一个LocalDate(LocalTime只有时分秒)
        LocalDate localDateInit = LocalDate.of(1998, 10, 1);
        LocalDateTime localTimeWithLocalDate = LocalTime.now().atDate(localDateInit);
        System.out.println("5.LocalTime指定一个LocalDate:" + localTimeWithLocalDate);
    }
}
