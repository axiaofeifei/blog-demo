package date.local;



import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 14:38
 */
public class LocalDateDemo {
    /**
     * LocalDate的初始化方法
     * 此处单元测试的注解是采用:org.junit.Test
     */
    @Test
    public void init(){
        //1.创建LocalDate,LocalDate对象直接调用now(),获取到当前日期
        LocalDate localDateNow = LocalDate.now();
        System.out.println("1.直接调用now()创建：" + localDateNow);


        //2.直接根据（年月日）创建,如：2021-05-20
        LocalDate localDateOf = LocalDate.of(2021, 5, 20);
        System.out.println("2.根据年月日创建：" + localDateOf);


        //3.直接根据某一年的某一天创建,如 2021年中第200天
        LocalDate localDateOfYearDay = LocalDate.ofYearDay(2021, 200);
        System.out.println("3.根据某一年的某一天创建：" + localDateOfYearDay);


        //4.根据java.time.temporal.TemporalAccessor创建(包括LocalDate,LocalDateTime等等)
        LocalDate localDateFrom = LocalDate.from(LocalDate.now());
        System.out.println("4.根据TemporalAccessor创建：" + localDateFrom);


        //5.根据时间字符串转化创建,此方法只支持yyyy-MM-dd格式的值
        LocalDate localDateParse = LocalDate.parse("2021-05-11");
        System.out.println("5.根据时间字符串转化创建:" + localDateParse);


        //6.根据时间字符串转化创建,
        // 调用parse(CharSequence text, DateTimeFormatter formatter)方法,
        // 此时的text可以根据formatter多变
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDateParse2 = LocalDate.parse("2021/05/15", formatter);
        //转化过来的都是2021-05-15这种形式
        System.out.println("6.根据时间字符串转化创建:" + localDateParse2);
    }

}
