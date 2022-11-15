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
    @GetMapping("/getPage")
    public List<Person> getPersonByPage(int page){
        int offset = page * 3;
        List<Person> list =  personService.queryPersonPage(page,offset);
        return list;
    }
}
