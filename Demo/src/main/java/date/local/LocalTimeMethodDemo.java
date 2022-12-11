package date.local;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 15:20
 */
public class LocalTimeMethodDemo {
    /**
     * LocalTime的常用使用方法
     * 此处单元测试的注解是采用:org.junit.Test
     * 和LocalDate的操作方法差不多
     */
    @Test
    public void usage() {
        //此处采用LocalTime对象直接调用now(),获取到当前时间,注意：如果使用我的实例，结果会不一样，因为LocalTime.now()是调用时的时间
        LocalTime currentTime = LocalTime.now();
        //1.获取时、分、秒
        System.out.println("------------------1.获取时、分、秒-----------------------");
        System.out.println("1.获取到的当前时间：" + currentTime);
        System.out.println("1.获取当前时间的小时：" + currentTime.getHour());
        System.out.println("1.获取当前时间的分钟：" + currentTime.getMinute());
        System.out.println("1.获取当前时间的秒：" + currentTime.getSecond());
        System.out.println("1.获取当前时间的秒：" + currentTime.getNano());


        //2.时间的加减
        System.out.println("------------------2.时间的加减-----------------------");
        System.out.println("2.获取到的当前时间：" + currentTime);
        System.out.println("2.加法：当前时间上增加1小时" + currentTime.plusHours(1));
        System.out.println("2.加法：当前时间上增加10分钟" + currentTime.plusMinutes(10));
        System.out.println("2.加法：当前时间上增加20秒" + currentTime.plusSeconds(20));
        System.out.println("2.减法：当前时间上减加2小时" + currentTime.minusHours(2));
        System.out.println("2.减法：当前时间上减加30分钟" + currentTime.minusMinutes(30));
        System.out.println("2.减法：当前时间上减加5秒" + currentTime.minusSeconds(5));
        System.out.println("------------------3.时间的判断及转化-----------------------");


        //3.初始化一个新的时间
        LocalTime initTime = LocalTime.of(13, 59, 59);
        System.out.println("3.获取到的当前时间：" + currentTime);
        System.out.println("3.新初始化的时间：" + initTime);
        System.out.println("3.判断当前时间是否是一个时间之后：" + currentTime.isAfter(initTime));
        System.out.println("3.判断当前时间是否是一个时间之前：" + currentTime.isBefore(initTime));
        System.out.println("3.修改小时数为12：" + currentTime.withHour(12));
        System.out.println("3.修改分钟数为12：" + currentTime.withMinute(12));
        System.out.println("3.修改秒数为12：" + currentTime.withSecond(12));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parseTime = LocalTime.parse("11:45:28", formatter);
        System.out.println("3.根据指定的时分秒和格式化类型生成时间：" + parseTime);
    }
}
