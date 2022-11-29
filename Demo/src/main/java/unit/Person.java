package unit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 11:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {
    private String name;
    private int salary;
    private int age;
    private String gender;
    private String city;


}
