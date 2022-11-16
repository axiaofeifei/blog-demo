/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 9:16
 */

package com.test.mybatistest.service;

import com.test.mybatistest.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface PersonService {
    List<Person> queryById(int id);

    List<Person> getAll();


    List<Person> queryPersonPage(int limit,int offset);

    Person queryPerson(Person person);

    List<Person> queryPersonList(List<Integer> list);

    List<Person> queryPersonListUserMap(HashMap<String,Integer> map);
}
