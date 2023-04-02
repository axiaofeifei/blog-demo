package com.example.springbootsatoken.controller;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import cn.hutool.core.date.DateTime;
import com.example.springbootsatoken.entity.SatokenUser;
import com.example.springbootsatoken.mapper.SatokenUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/26 10:28
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private SatokenUserMapper userMapper;



    /**
     * 登录  ---- http://localhost:8081/user/login
     * @param name
     * @param pwd
     * @return
     */
    @GetMapping("/login")
    public SaResult doLogin(@RequestParam("username") String name, @RequestParam("password") String pwd) {
        SatokenUser user = userMapper.selectByUsername(name);
        String password = SaSecureUtil.md5BySalt(pwd, user.getSalt());
        if (password.equals(user.getPassword())){
            StpUtil.login(10001);
            return SaResult.ok("登录成功");
        }
        return SaResult.error("登录失败");
    }

    /**
     * 查询登录状态  ---- http://localhost:8081/user/isLogin
     * @return
     */
    @RequestMapping("isLogin")
    public SaResult isLogin() {
        return SaResult.ok("是否登录：" + StpUtil.isLogin());
    }

    /**
     * 查询 Token 信息  ---- http://localhost:8081/user/tokenInfo
     * @return
     */
    @RequestMapping("tokenInfo")
    public SaResult tokenInfo() {
        return SaResult.data(StpUtil.getTokenInfo());
    }


    // 测试注销  ---- http://localhost:8081/user/logout
    @RequestMapping("logout")
    public SaResult logout() {
        StpUtil.logout();
        return SaResult.ok();
    }

}
