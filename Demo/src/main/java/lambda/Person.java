package test.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/2 10:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String gender;
    private String sex;
    private int salary;

}
