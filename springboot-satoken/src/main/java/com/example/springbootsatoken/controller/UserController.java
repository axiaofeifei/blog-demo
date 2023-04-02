package com.example.springbootsatoken.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.annotation.SaMode;
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
        //各种加密方式
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

    /**
     * 注解式鉴权：只要具有其中一个权限即可通过校验
     * @return
     */
    //SaMode.AND, 标注一组权限，会话必须全部具有才可通过校验
    //SaMode.OR, 标注一组权限，会话只要具有其一即可通过校验
    @RequestMapping("atJurOr")
    @SaCheckPermission(value = {"user-add", "user-all", "user-delete"}, mode = SaMode.OR)
    public SaResult atJurOr() {
        return SaResult.ok("用户信息");
    }


    // 注解式鉴权：只要具有其中一个权限即可通过校验
    @RequestMapping("userAdd")
    @SaCheckPermission(value = "user-add", orRole = "admin")
    public SaResult userAdd() {
        return SaResult.ok("用户信息");
    }
    //orRole 字段代表权限认证未通过时的次要选择，两者只要其一认证成功即可通过校验，其有三种写法：
    //写法一：orRole = "admin"，代表需要拥有角色 admin 。
    //写法二：orRole = {"admin", "manager", "staff"}，代表具有三个角色其一即可。
    //写法三：orRole = {"admin, manager, staff"}，代表必须同时具有三个角色




}
