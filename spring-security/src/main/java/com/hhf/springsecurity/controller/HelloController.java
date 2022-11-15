package com.hhf.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.hhf.springsecurity.controller
 *
 * @author hehongfei
 * @date 2022/6/6 14:46
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/controller")
	public String Hello(){
		return "hello";
	}

}
