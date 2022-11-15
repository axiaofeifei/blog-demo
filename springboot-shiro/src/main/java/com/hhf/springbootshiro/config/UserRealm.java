package com.hhf.springbootshiro.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hhf.springbootshiro.entity.User;
import com.hhf.springbootshiro.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * com.hhf.springbootshiro.config
 *
 * @author hehongfei
 * @date 2022/6/6 16:35
 */
public class UserRealm extends AuthorizingRealm {
	@Resource
	private UserService userService;

	Logger logger = LoggerFactory.getLogger(getClass());

	QueryWrapper<User> queryWrapper = new QueryWrapper<>();




	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		logger.info("-----------执行了=>授权doGetAuthorizationInfo------------");
		System.out.println("执行了=>授权doGetAuthorizationInfo");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();



		//给所有用户授予user:add权限     应该在数据库中设置，使用了perms参数
		// info.addStringPermission("user:add");
		//获取当前subject
		Subject subject = SecurityUtils.getSubject();
		// System.out.println("subject.toString() = " + subject.toString());

		// System.out.println("subject.getPrincipal() = " + subject.getPrincipal());
		System.out.println("subject.getPrincipal() = " + subject.getPrincipals());
		// System.out.println("subject.getPrincipal() = " + subject.getPreviousPrincipals());
		// System.out.println("subject.getPrincipal() = " + subject.getSession().getAttribute("name"));
		User currentUser = (User)subject.getPrincipal();

		// String CurrentUserName = "root";
		QueryWrapper<User> userQueryWrapper = queryWrapper.eq("name", currentUser.getName());
		User CurrentUser = userService.getOne(userQueryWrapper);
		// //设置当前user的权限(从数据库中读取)
		info.addStringPermission(CurrentUser.getPerms());
		return info;

	}


	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		logger.info("----------执行了=>认证doGetAuthorizationInfo----------");
		System.out.println("执行了=>认证doGetAuthorizationInfo");
		//获取MyController建立的token对象
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		//根据token携带的用户名，从数据库中查询用户信息
		// System.out.println("----------------------token中能够查询到什么信息");
		// System.out.println("token.getCredentials() = " + token.getCredentials());
		// System.out.println("token.getHost() = " + token.getHost());
		// //获取用户名
		System.out.println("token.getUsername() = " + token.getUsername());
		// //获取用户密码
		// System.out.println("token.getPassword() = " + token.getPassword());
		// //获取当前的用户
		// System.out.println("token.getPrincipal() = " + token.getPrincipal());

		queryWrapper.eq("name", token.getUsername());
		User user = userService.getOne(queryWrapper);
		System.out.println("user.getName() = " + user.getName());
		//确认查询的数据不为空
		if (user == null)
			return null;//只需要return null,就会自动抛出UnknownAccountException一场
		//密码认证,涉及到安全问题,shiro自动完成
		return new SimpleAuthenticationInfo(user, user.getPwd(), "");


		//用户名认证
		// if (!token.getUsername().equals(username))
		// 	return null;//只需要return null,就会自动抛出UnknownAccountException异常
		// //密码认证,涉及到安全问题,shiro自动完成
		// return new SimpleAuthenticationInfo("", password, "hhf");
	}


}
