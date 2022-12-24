package creator.builder;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 13:59
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        mbike.setFrame("ofo的框架...");
        System.out.println("生产一辆ofo的框架...");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("ofo的座椅...");
        System.out.println("生产一辆ofo的座椅...");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
