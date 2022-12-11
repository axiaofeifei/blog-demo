package date;



import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/10 16:10
 */
public class DateTest {

    @Test
    public void test(){
        Date date = new Date("2022/12/10 16:00:00");
        Date date1 = new Date();
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);




    }
}
