package Initializingbean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/17 16:55
 */
public class InitializingBeanDemoTest {


    public static void main(String[] args) {
        InitializingBeanDemo demo = new InitializingBeanDemo(11,"",23);
        demo.getName();
    }
}
