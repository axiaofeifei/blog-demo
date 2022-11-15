package com.hhf.springbootshiro.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * com.hhf.springbootshiro.config
 *
 * @author hehongfei
 * @date 2022/6/6 16:34
 */
@Configuration
public class ShiroConfig {
	//ShiroFilterFactoryBean
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		//设置安全管理器
		bean.setSecurityManager(defaultWebSecurityManager);
		//添加shiro内置的过滤器
    /*
            anon：无需认证就可以访问
            authc：必须认证了才能访问
            user：必须拥有记住我功能才能使用
            perms：拥有对某个资源的权限才能访问
            role：拥有某个角色权限才能访问
         */
		Map<String, String> filterMap = new LinkedHashMap<>();//链式
		// filterMap.put("/user/add", "anon");
		// filterMap.put("/user/update", "authc");
		//设置授权,只有user:add权限的才能请求/user/add
		filterMap.put("/user/add", "perms[user:add]");
        //设置授权,只有user:update权限的才能请求/user/update
		filterMap.put("/user/update", "perms[user:update]");
		//设置未授权页面的请求
		bean.setUnauthorizedUrl("/unauthorized");


		//filterMap.put("/user/*", "authc");支持通配符
		bean.setFilterChainDefinitionMap(filterMap);//参数为map类型
		//设置登录的请求
		bean.setLoginUrl("/toLogin");
		return bean;

	}

	//DefaultWebSecurityManager
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		//关联UserRealm
		securityManager.setRealm(userRealm);
		return securityManager;
	}

	//创建realm对象,自定义
	@Bean
	public UserRealm userRealm(){
		return new UserRealm();
	}
}
