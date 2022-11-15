package com.hhf.springbootshiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.hhf.springbootshiro.controller
 *
 * @author hehongfei
 * @date 2022/6/6 16:42
 */
@Controller
@RequestMapping
public class MyController {

	Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 拦截器是否能够成功的认证
	 * @return
	 */
	@RequestMapping("/user/add")
	public String add() {
		return "user/add";
	}
	/**
	 * 拦截器是否能够成功的认证
	 * @return
	 */
	@RequestMapping("/user/update")
	public String update() {
		return "user/update";
	}

	/**
	 * 路径输入toLogin跳转到login.html界面。
	 * 输入username,password，提交。
	 * 自动运行login方法（）。
	 * SecurityUtils.getSubject();从ThreadLocal中获得用户信息
	 * 封装用户信息新建token
	 * token被拿到认证方法中认证
	 * 被拿到授权方法中
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info("--------------toLogin---------------");
		return "/login";
	}

	/**
	 * 不可以直接输入login路径需要通过toLogin跳转只login路径
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String username, String password, Model model) {
		logger.info("----------------------------login-------------------------------");
		System.out.println("----------------------------------------------------------");
		//SecurityUtils.getSubject();
		Subject subject = SecurityUtils.getSubject();


		//封装用户信息生成token令牌
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);


		//执行登录操作,可以自定义捕获异常
		try {
			System.out.println("++++++++++++++登录成功++++++++++++==================");
			//登录成功就能在其他地方使用SecurityUtils.getSubject();
			//login(token)会跳转到认证的	UserRealm的doGetAuthenticationInfo() 方法
			//doGetAuthenticationInfo() 方法执行完后login(token)也执行完了
			subject.login(token);//执行登录方法,如果没有异常就说明OK了！

			// System.out.println("subject.getPrincipal() = " + subject.getPrincipal());
			return "index";//登录成功返回首页
		} catch (UnknownAccountException e) {
			model.addAttribute("msg","用户名错误");
			return "login";//用户名错误回到登录页面
		} catch (IncorrectCredentialsException e) { //密码不存在
			model.addAttribute("msg","密码错误");
			return "login";//证书
		}
	}

	@RequestMapping("/unauthorized")
	@ResponseBody
	public String unauthorized(){
		return "未经授权无法访问此页面";
	}



}
