package reflect;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 8:19
 */
@Data
@NoArgsConstructor
public class Dog {
    @ApiModelProperty(value = "姓名",required = true)
    private String name;

    @ApiModelProperty(value = "年龄",required = true)
    private String age;

}
