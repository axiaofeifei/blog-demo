package com.hhf.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.hhf.springsecurity.controller
 *
 * @author hehongfei
 * @date 2022/6/6 15:34
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/login")
	public String Hello(){
		return "lgoin";
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome";
	}

}
