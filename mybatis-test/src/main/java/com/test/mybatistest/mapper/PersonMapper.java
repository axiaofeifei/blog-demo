/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 8:34
 */

package com.test.mybatistest.mapper;

import com.test.mybatistest.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> selectById(int id);

    List<Person> selectAll();

    List<Person> selectPersonPage(@Param("limit") int limit,@Param("offset") int offset);
}
