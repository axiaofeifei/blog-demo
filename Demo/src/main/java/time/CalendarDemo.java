package time;

import java.util.Calendar;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 11:27
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        long time = calendar.getTime().getTime();
        System.out.println(time);
    }
}
