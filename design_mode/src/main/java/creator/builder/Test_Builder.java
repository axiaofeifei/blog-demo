package creator.builder;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 14:18
 */
public class Test_Builder {

    @Test
    public void test(){
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }

    private void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
