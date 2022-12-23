package config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/23 15:00
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class GetDatasource {
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
