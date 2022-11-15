package com.test.mybatistest.controller;

import com.test.mybatistest.entity.Person;
import com.test.mybatistest.service.PersonService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 9:50
 */
@RestController
@RequestMapping(value = "/test",method = RequestMethod.GET)
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/getAll")
    public List<Person> getAll(){
        List<Person> all = personService.getAll();
        return all;
    }

    @GetMapping("/getOne")
    public List<Person> getOneById(@Param("id") int id){
        List<Person> all = personService.queryById(id);
        return all;
    }

    //分页查询，每页两条
    @GetMapping("/getPerson")
    public Person getPerson(){
        Person paramPerson1 = new Person(4,"小何",23,10000,"男");
        Person paramPerson5 = new Person(null,null,null,null,null);
        Person paramPerson2 = new Person(4,null,23,10000,"男");
        //不加 1=1 或者<where>标签的话会报错。  因为会加上一个and标签
        Person paramPerson3 = new Person(null,"小何",23,10000,"男");
        Person paramPerson4 = new Person(null,"小何",null,null,"男");

        Person resultPerson =  personService.queryPerson(paramPerson1);
        return resultPerson;
    }

    //分页查询，每页两条
    @GetMapping("/getPage")
    public List<Person> getPersonByPage(int page){
        int offset = page * 3;
        List<Person> list =  personService.queryPersonPage(page,offset);
        return list;
    }
}
