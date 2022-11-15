package hhf.springbootredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hhf.springbootredis.controller
 *
 * @author hehongfei
 * @date 2022/5/26 16:59
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/hhf")
    public String hello(){
        return "hello hhf";
    }
}
