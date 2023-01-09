package command.ceilingfan;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 13:41
 */
@Data
@NoArgsConstructor
public class CeiLingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeiLingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void setHigh(){
        speed = HIGH;
        System.out.println("风扇高速...");
    }

    public void setMedium(){
        speed = MEDIUM;
        System.out.println("风扇中速...");
    }

    public void setLow(){
        speed = LOW;
        System.out.println("风扇低速...");
    }

    public void setOff(){
        speed = OFF;
        System.out.println("关闭风扇...");
    }

    public int getSpeed(){
        System.out.println("风扇速度"+speed);
        return speed;
    }

    public void on() {
        System.out.println("打开风扇...");
    }
}
