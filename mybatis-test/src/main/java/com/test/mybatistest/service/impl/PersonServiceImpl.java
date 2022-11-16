package com.test.mybatistest.service.impl;

import com.test.mybatistest.entity.Person;
import com.test.mybatistest.mapper.PersonMapper;
import com.test.mybatistest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 8:38
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> queryById(int id) {
        List<Person> people = personMapper.selectById(id);

        return people;

    }

    @Override
    public List<Person> getAll() {
        List<Person> people = personMapper.selectAll();
        return people;
    }

    @Override
    public List<Person> queryPersonPage(int limit,int offset) {

       return personMapper.selectPersonPage(limit,offset);
    }

    @Override
    public Person queryPerson(Person person) {
        Person resultPerson = personMapper.selectPerson(person);
        return resultPerson;
    }

    @Override
    public List<Person> queryPersonList(List<Integer> list) {
        List<Person> people = personMapper.selectPersonList(list);

        return people;

    }

    @Override
    public List<Person> queryPersonListUserMap(HashMap<String, Integer> map) {
        List<Person> people = personMapper.selectPersonListUserMap(map);
        return people;
    }

    @Override
    public Integer newList(List<Person> list) {
        Integer integer = personMapper.insertList(list);
        return integer;
    }
}
