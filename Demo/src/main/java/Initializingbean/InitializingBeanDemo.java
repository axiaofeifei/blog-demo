package Initializingbean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/17 16:22
 */
@Data
public class InitializingBeanDemo implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("加载------------------------------");

    }

}
