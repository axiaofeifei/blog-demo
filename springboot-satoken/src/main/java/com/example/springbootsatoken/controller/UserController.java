package com.example.springbootsatoken.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.secure.SaBase64Util;
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
 * @Date 2023/1/19 9:41
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SatokenUserMapper userMapper;

    /**
     * 创建用户  ---- http://localhost:8081/user/create
     * @param user
     * @return
     */
    @PostMapping("/create")
    public SaResult createUser(@RequestBody SatokenUser user){

        String md5BySalt = SaSecureUtil.md5BySalt(user.getPassword(), user.getSalt());
        // md5加密
        // SaSecureUtil.md5("123456");
        // sha1加密
        // SaSecureUtil.sha1("123456");
        // sha256加密
        // SaSecureUtil.sha256("123456");
        // md5加盐加密: md5(md5(str) + md5(salt))
        // SaSecureUtil.md5BySalt("123456", "salt");


        user.setPassword(md5BySalt);
        user.setCreateTime(new DateTime());

        userMapper.createUser(user);
        return SaResult.ok();
    }

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


    // 登录认证：只有登录之后才能进入该方法   http://localhost:8081/user/info
    @SaCheckLogin
    @RequestMapping("/info")
    public String info() {
        return "查询用户信息";
    }

    // 角色认证：必须具有指定角色才能进入该方法  http://localhost:8081/user/add
    @SaCheckRole("super-admin")
    @RequestMapping("/add")
    public String add() {
        return "用户增加";
    }

}
