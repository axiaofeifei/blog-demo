package hhf.mybatisplusdemo.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/22 11:21
 */
@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor MybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //配置mybatisplus分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}
