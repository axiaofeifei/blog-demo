package com.example.springbootmuldatasources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * hhf.springbootredis.controller
 *
 * @author hehongfei
 * @date 2022/5/26 17:07
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;



    /**
     * redis存入String类型数据的测试
     * @return
     */
    @GetMapping("/testString")
    public String RedisTestString(){
//        设置String的key,value
        redisTemplate.opsForValue().set("testString","String");
//        获取redis存储的string类型的value
        String testString = (String) redisTemplate.opsForValue().get("testString");
        return testString;

    }
    /**
     * redis存入hash类型数据的测试
     * @return
     */
    @GetMapping("/testHash")
    public Map<String,String> RedisTestHash(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("testHash1","HashValue1");
        stringStringHashMap.put("testHash2","HashValue2");
        stringStringHashMap.put("testHash3","HashValue3");
        stringStringHashMap.put("testHash4","HashValue4");

        //单个存入
        redisTemplate.opsForHash().put("testHash","testHash0","HashValue0");
        // 设置redis的hash的key,value
        redisTemplate.opsForHash().putAll("testHash",stringStringHashMap);


        // //获得redis存储的Hash
        System.out.println("输出redis存储的Hash");

        Object o = redisTemplate.opsForHash().get("testHash", "testHash0");
        System.out.println(o);
        Map result = redisTemplate.opsForHash().entries("testHash");
        System.out.println(result);

        return result;

    }

    /**
     * redis存入list类型数据的测试
     * @return String
     */
    @GetMapping("/testList")
    public String RedisTestList(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("list1");
        stringList.add("list2");
        stringList.add("list3");
        // 设置redis的list的key,value,使用json的形式
        String key = "testList1";
        redisTemplate.opsForValue().set(key,stringList.toString());
        //输出redis存储的list
        System.out.println("输出redis存储的testList1");
        String result = (String) redisTemplate.opsForValue().get(key);
        System.out.println(result);


        ArrayList<String> stringList2 = new ArrayList<>();
        stringList2.add("list4");
        stringList2.add("list5");
        stringList2.add("list6");
        String key2 = "testList2";
        redisTemplate.opsForList().rightPush(key2,stringList2);
        //去除list的数据
        Object result2 = redisTemplate.opsForList().rightPop(key2);
        //取出后数据内就没有了，redis里面就不会有数据所以重新存入
        redisTemplate.opsForList().rightPush(key2,stringList2);

        System.out.println("输出redis存储的testList2");
        System.out.println(result2);


        return result+result2;

    }

    /**
     * redis存入Set类型数据的测试
     * @return
     */
    @GetMapping("/testSet")
    public String  RedisTestSet(){


        String key = "testSet";
        Long add = redisTemplate.opsForSet().add(key, "set1", "set2", "set3", "set4");
        System.out.println(add);
        Object pop = redisTemplate.opsForSet().pop(key);
        System.out.println(pop);

        String result = pop.toString();

        return result;
    }


    /**
     * redis存入ZSet类型数据的测试
     * @return
     */
    //@GetMapping("/testZset")
    //public String RedisTestZSet(){
    //    String key = "testZSet";
    //    redisTemplate.opsForZSet().add(key,"zset1",2);
    //
    //    redisTemplate.opsForZSet().popMax(key);
    //    redisTemplate.opsForZSet().popMin(key);
    //
    //    System.out.println(typedTupleMax);
    //    System.out.println(typedTupleMIn);
    //    String str = typedTupleMax.toString();
    //    String str2 = typedTupleMIn.toString();
    //    return str+str2;
    //
    //}



}
