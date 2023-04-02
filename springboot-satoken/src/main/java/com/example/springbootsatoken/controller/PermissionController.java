package com.example.springbootsatoken.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/26 9:44
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    // 测试角色接口， 浏览器访问： http://localhost:8081/user/testRole
    @RequestMapping("/testRole")
    public SaResult testRole() {
        System.out.println("======================= 进入方法，测试角色接口 ========================= ");

        System.out.println("是否具有角色标识 user " + StpUtil.hasRole("user"));
        System.out.println("是否具有角色标识 admin " + StpUtil.hasRole("admin"));

        System.out.println("没有admin权限就抛出异常");
        StpUtil.checkRole("admin");

        System.out.println("在【admin、user】中只要拥有一个就不会抛出异常");
        StpUtil.checkRoleOr("admin", "user");

        System.out.println("在【admin、user】中必须全部拥有才不会抛出异常");


        //用户没有user权限报错，因此报错。
        // 我们在StpInterface中的getRoleList方法中添加user权限，然后测试通过
        StpUtil.checkRoleAnd("admin", "user");


        System.out.println("角色测试通过");

        return SaResult.ok();
    }

    // 测试权限接口， 浏览器访问： http://localhost:8081/user/testJur
    @RequestMapping("testJur")
    public SaResult testJur() {
        System.out.println("======================= 进入方法，测试权限接口 ========================= ");

        System.out.println("是否具有权限101---" + StpUtil.hasPermission("101"));
        System.out.println("是否具有权限user-add---" + StpUtil.hasPermission("user-add"));
        System.out.println("是否具有权限article-get---" + StpUtil.hasPermission("article-get"));

        System.out.println("没有user-add权限就抛出异常");
        StpUtil.checkPermission("user-add");

        System.out.println("在【101、102】中只要拥有一个就不会抛出异常");
        StpUtil.checkPermissionOr("101", "102");

        System.out.println("在【101、102】中必须全部拥有才不会抛出异常");
        //用户没有102权限报错，因此报错。
        // 我们在StpInterface中的getPermissionList方法中添加102权限，然后测试通过
        StpUtil.checkPermissionAnd("101", "102");

        System.out.println("权限测试通过");

        return SaResult.ok();



        // 判断：当前账号是否含有指定权限, 返回true或false
        //StpUtil.hasPermission("user-update");
        // 校验：当前账号是否含有指定权限, 如果验证未通过，则抛出异常: NotPermissionException
        //StpUtil.checkPermission("user-update");
        // 校验：当前账号是否含有指定权限 [指定多个，必须全部验证通过]
        //StpUtil.checkPermissionAnd("user-update", "user-delete");
        // 校验：当前账号是否含有指定权限 [指定多个，只要其一验证通过即可]
        //StpUtil.checkPermissionOr("user-update", "user-delete");


        // 判断：当前账号是否拥有指定角色, 返回true或false
        //StpUtil.hasRole("super-admin");
        // 校验：当前账号是否含有指定角色标识, 如果验证未通过，则抛出异常: NotRoleException
        //StpUtil.checkRole("super-admin");
        // 校验：当前账号是否含有指定角色标识 [指定多个，必须全部验证通过]
        //StpUtil.checkRoleAnd("super-admin", "shop-admin");
        // 校验：当前账号是否含有指定角色标识 [指定多个，只要其一验证通过即可]
        //StpUtil.checkRoleOr("super-admin", "shop-admin");
    }




}
