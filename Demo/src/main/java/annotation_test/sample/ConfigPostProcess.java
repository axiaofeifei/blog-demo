package annotation_test.sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Map;
/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/23 15:54
 */
@Component
public class ConfigPostProcess implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigPostProcess.class);

    private static final String FILE_NAME = "config.properties";

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //获取使用了我们自定义注解@Config的类
        PropertiesConfig configAnnotation = AnnotationUtils.findAnnotation(bean.getClass(), PropertiesConfig.class);
        //如果这个对象使用了此注解
        if (configAnnotation != null) {
            LOGGER.info("当前操作的类:{}", beanName);


            //解析配置文件，并将解析结果放入Map中。getConfigPropertiesFromFile找不到方法
            //Map<String, String> configProperties = getConfigPropertiesFromFile(configAnnotation);
            //将对应的值，使用反射技术，注入到这个bean中。bindBeanValue找不到方法
            //bindBeanValue(bean, configProperties);
        }

        return bean;
    }

}