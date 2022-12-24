package com.hhf.springbootshiro.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ShiroUtil {

    /**
     * 加盐参数
     */
    public final static String hashAlgorithmName = "MD5";

    /**
     * 循环次数
     */
    public final static int hashIterations = 1024;


    private static Logger logger = LoggerFactory.getLogger(ShiroUtil.class);

    /**
     * shiro密码加密工具类
     *
     * @param credentials 密码
     * @param saltSource  密码盐
     * @return
     */
    public static String md5(String credentials, String saltSource) {
        ByteSource salt = new Md5Hash(saltSource);
        return new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations).toString();
    }

    /**
     * 获取封装的 ShiroUser
     *
     * @return ShiroUser
     */

    /*
    public static ShiroUserDTO getUser() {
        Subject subject = SecurityUtils.getSubject();
        PrincipalCollection principalCollection = subject.getPrincipals();
        Object o = principalCollection.getPrimaryPrincipal();
        return (ShiroUserDTO) o;
    }
    */


}
