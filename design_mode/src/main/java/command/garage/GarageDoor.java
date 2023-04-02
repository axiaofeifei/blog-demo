package command.garage;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 9:27
 */
@Data
@NoArgsConstructor
public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("打开门...");
    }

    public void off(){
        System.out.println("关闭门...");
    }
}
