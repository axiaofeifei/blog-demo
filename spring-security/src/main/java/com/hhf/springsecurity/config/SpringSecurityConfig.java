package com.hhf.springsecurity.config;

import com.hhf.springsecurity.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * com.hhf.springsecurity.config
 *
 * @author hehongfei
 * @date 2022/6/6 14:31
 */
@EnableWebSecurity
@Configuration
public class SpringSecurityConfig implements WebMvcConfigurer {

	@Autowired
	private MyInterceptor myInterceptor;
	/**
	 * 拦截所有从/admin访问的路径
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor)
				.addPathPatterns("/test/**")   //要拦截的路径
				.excludePathPatterns("/test/login");   //不拦截的路径
	}

	/**
	 * 跨域访问配置：仅仅允许来自 domain2.com 的跨域访问，并且限定访问路径为／api 、方法是 POST 或者 GET
	 * @param registry
	 */
	// @Override
	// public void addCorsMappings(CorsRegistry registry) {
	// 	registry.addMapping("/api/**")
	// 			.allowedOrigins(" http : //domain2.com")
	// 			.allowedMethods(" POST", "GET");
	// }

	/**
	 * 视图解析器  /toLogin  跳转到login
	 * 参数一: 指定访问路径，参数二: 指定该路径对应的视图名。
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("hello");
	}



}
