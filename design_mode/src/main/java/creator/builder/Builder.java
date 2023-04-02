/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 13:55
 */

package creator.builder;

import java.util.PrimitiveIterator;

public abstract class Builder {
    public Bike mbike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
