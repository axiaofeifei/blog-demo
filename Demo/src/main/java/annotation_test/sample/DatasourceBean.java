package annotation_test.sample;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/23 15:51
 */
@Data
@Configuration
@PropertiesConfig(prefix = "spring.datasource")
public class DatasourceBean {
    private String name;
    private String url;
    private String username;
    private String password;

}
