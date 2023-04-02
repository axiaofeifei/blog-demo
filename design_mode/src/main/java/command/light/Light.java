package command.light;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 9:05
 */
@Data
@NoArgsConstructor
public class Light {

    private String location;


    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("打开了在"+location+"的灯...");
    }

    public void off(){
        System.out.println("关闭了在"+location+"的灯...");
    }
}
