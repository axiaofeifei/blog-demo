package date;



import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/10 16:10
 */
public class DateTest {

    @Test
    public void test() throws ParseException {
        //Date date = new Date("2022/12/10 16:00:00");
        //Date date1 = new Date();
        //System.out.println("date = " + date);
        //System.out.println("date1 = " + date1);


        LocalDateTime now = LocalDateTime.now();
        String string = localDateTimetoString(now);
        Date stringToDate = stringToDate(string);
        System.out.println(stringToDate);

    }

    private String localDateTimetoString(LocalDateTime localDateTime) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = localDateTime.format(fmt);
        return dateStr;
    }


    private Date stringToDate(String strTime)
            throws ParseException {
        String formatType = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }

}
