package Initializingbean;

import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/17 16:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//测试失败
//大致理解了什么意思,但没能实现
//InitializingBean的作用是Bean注入到Spring容器且初始化后，
// 执行特定业务化的操作，即afterPropertiesSet()
public class InitializingBeanDemo implements InitializingBean {
    private Integer id;

    private String name;

    private Integer age;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("加载------------------------------");
            if (StringUtils.isEmpty(name)) {
                System.out.println("name不存在");
        }

    }

}
