package annotation_test;

import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/23 15:00
 */

/*
* 从配置文件中获取信息
* 1.需要有get，set方法，不能是静态的
* 2.必须有configuration或者component这类注解
* 3.启动类上需要添加@EnableConfigurationProperties注解
* */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class GetDatasourceBean {
    private String url;
    private String name;
    private String driverClassName;
    private String username;
    private String password;

    @Test
    public void test(){
        System.out.println(name);
        System.out.println(url);
        System.out.println(username);
    }
}
