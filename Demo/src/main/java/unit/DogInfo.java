package unit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 16:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogInfo {
    private String name;

    private String age;

    private String color;

    private String birthday;
}
