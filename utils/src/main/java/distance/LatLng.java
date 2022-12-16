package distance;

/**
 * 经纬度坐标类
 * Created by changmingzhe on 2015-09-09.
 */
public class LatLng {
    private static final String a = LatLng.class.getSimpleName();
    public final double latitude;
    public final double longitude;

    /**
     *
     * @param lat latitude
     * @param lng longitude
     */
    public LatLng(double lat, double lng) {
        int var5 = (int) (lat * 1000000.0D);
        int var6 = (int) (lng * 1000000.0D);
        this.latitude = (double) var5 / 1000000.0D;
        this.longitude = (double) var6 / 1000000.0D;
    }

    public String toString() {
        String var1 = new String("latitude: ");
        var1 = var1 + this.latitude;
        var1 = var1 + ", longitude: ";
        var1 = var1 + this.longitude;
        return var1;
    }
}
