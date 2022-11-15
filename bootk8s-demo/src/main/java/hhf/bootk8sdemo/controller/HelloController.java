package hhf.bootk8sdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hhf.bootk8sdemo.controller
 *
 * @author hehongfei
 * @date 2022/5/27 15:44
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/k8s")
    public String hello(){
        return "hello myself and k8s";
    }
}
