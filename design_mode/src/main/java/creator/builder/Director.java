package creator.builder;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 14:02
 */
public class Director {
    private Builder mbuilder;

    public Director(Builder builder) {
        mbuilder = builder;
    }

    public Bike construct(){
        mbuilder.buildFrame();
        mbuilder.buildSeat();
        return mbuilder.createBike();
    }
}
