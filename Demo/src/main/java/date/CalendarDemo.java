package date;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 11:27
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar.getTime() = " + calendar.getTime());
        long time = calendar.getTime().getTime();
        System.out.println("calendar.getTime().getTime() = " + time);

        Timestamp timestamp = new Timestamp(calendar.getTime().getTime());
        System.out.println("timestamp = " + timestamp);

        LocalDate now = LocalDate.now();
        System.out.println("LocalDate = " + now);
        LocalTime now1 = LocalTime.now();
        System.out.println("LocalTime = " + now1);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("LocalDateTime = " + now2);
    }
}
