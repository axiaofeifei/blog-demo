package com.example.springbootsatoken.mapper;

import com.example.springbootsatoken.entity.SatokenUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/19 14:09
 */

@Mapper
public interface SatokenUserMapper {

    @Insert("INSERT INTO satokenuser (user_name,real_name,password,salt,removed) VALUES (" +
            "#{username},#{realName},#{password},#{salt},#{removed})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int createUser(SatokenUser user);
    @Select("select * from satokenuser where user_name=#{username}")
    //@Select("select * from SatokenUser where username=#{username} and removed=Removed.FALSE")
    SatokenUser selectByUsername(@Param("username") String name);
}
