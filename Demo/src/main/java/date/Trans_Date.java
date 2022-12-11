package date;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/11 15:58
 */
public class Trans_Date {

    //Date和String互相转化
    @Test
    public void test() throws ParseException {
        Date date = new Date();
        String formatType = "2022-12-21 02:23:33";
        //date转string的测试
        String dateToString = dateToString(date, formatType);
        System.out.println("dateToString = " + dateToString);
        //string转date的测试
        Date stringToDate = stringToDate(formatType, "yyyy-MM-dd HH:mm:ss");
        System.out.println("stringToDate = " + stringToDate);

        //localdateTime转string
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = localDateTimetoString(localDateTime);
        System.out.println("time = " + time);

        //string转localdateTime
        String dateStr = "2021-08-19 15:11:30";
        LocalDateTime localDateTime1 = stringToLocaldateTime(formatType);
        System.out.println("localDateTime1 = " + localDateTime1);

        //localdatetime转date
        Date localDateTimeToDate = localDateTimeToDate(localDateTime);
        System.out.println("localDateTimeToDate = " + localDateTimeToDate);

        //    date转localdatetime
        LocalDateTime dateToLocalDateTime = dateToLocalDateTime(date);
        System.out.println("dateToLocalDateTime = " + dateToLocalDateTime);
    }

    /**
     * LocalDateTime转为日期
     *
     * @param localDateTime LocalDateTime
     * @return 日期
     */
    private static Date localDateTimeToDate(final LocalDateTime localDateTime) {
        if (null == localDateTime) {
            return null;
        }
        final ZoneId zoneId = ZoneId.systemDefault();
        final ZonedDateTime zdt = localDateTime.atZone(zoneId);
        final Date date = Date.from(zdt.toInstant());
        return date;
    }



    /**
     * 日期转为LocalDateTime
     *
     * @param date 日期
     * @return LocalDateTime
     */
    private static LocalDateTime dateToLocalDateTime(Date date) {
        if (null == date) {
            return null;
        }
        final Instant instant = date.toInstant();
        final ZoneId zoneId = ZoneId.systemDefault();
        final LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime;
    }


    private LocalDateTime stringToLocaldateTime(String formatType) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(formatType, fmt);
        return localDateTime;
    }

    private String localDateTimetoString(LocalDateTime localDateTime) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = localDateTime.format(fmt);
        return dateStr;
    }


    private String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }

    // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
    // HH时mm分ss秒，
    // strTime的时间格式必须要与formatType的时间格式相同
    private Date stringToDate(String strTime, String formatType)
            throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }

}
