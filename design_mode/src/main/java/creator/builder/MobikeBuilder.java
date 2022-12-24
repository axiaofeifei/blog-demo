package creator.builder;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 13:57
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mbike.setFrame("mobike的框架");
        System.out.println("生产一辆摩拜单车的框架...");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("mobike的座椅");
        System.out.println("生产一辆摩拜单车的座椅");
    }

    @Override
    public Bike createBike() {

        return mbike;
    }
}
