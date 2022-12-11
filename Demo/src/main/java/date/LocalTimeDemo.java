package date;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 15:19
 */
public class LocalTimeDemo {
    /**
     * LocalTime的初始化方法
     * 此处单元测试的注解是采用:org.junit.Test
     */
    @Test
    public void init() {
        //1.LocalTime,LocalTime对象直接调用now(),获取到当前时间
        LocalTime now = LocalTime.now();
        System.out.println("1.获取到的当前时间：" + now);

        //2.根据指定的时分秒生成时间
        LocalTime localTimeOf = LocalTime.of(23, 59, 59);
        System.out.println("2.根据指定的时分秒生成时间：" + localTimeOf);

        //3.根据指定的时分秒生成时间
        LocalTime localTimeParse = LocalTime.parse("12:23:45");
        System.out.println("3.根据指定的时分秒生成时间：" + localTimeParse);

        //4.根据指定的时分秒和格式化类型生成时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");//注意：HH是24小时制，hh是12小时制，时间类型的不要出现年月日如：yyyyMMdd
        LocalTime localTimeParseWithFormatter = LocalTime.parse("102008", formatter);
        System.out.println("4.根据指定的时分秒和格式化类型生成时间：" + localTimeParseWithFormatter);

        //5.根据时间对象TemporalAccessor生成
        LocalTime initTime = LocalTime.of(11, 59, 59);
        System.out.println("5.根据时间对象TemporalAccessor生成:" + LocalTime.from(initTime));
    }
}
