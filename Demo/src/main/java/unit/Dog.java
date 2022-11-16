package unit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 11:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog {
    private String name;

    private int age;

    private String color;
}
