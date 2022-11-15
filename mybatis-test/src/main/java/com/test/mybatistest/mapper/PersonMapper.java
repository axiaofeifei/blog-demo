/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 8:34
 */

package com.test.mybatistest.mapper;

import com.test.mybatistest.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> selectById(int id);

    List<Person> selectAll();

    //分页查询
    List<Person> selectPersonPage(@Param("limit") int limit,@Param("offset") int offset);

    Person selectPerson(Person person);
}
