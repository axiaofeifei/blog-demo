

import unit.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 11:38
 */
public class ForeachDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,8,6,7,9);
        // 遍历输出符合条件的值
        list.stream().filter(l -> l > 5).forEach(System.out::print);
        System.out.println();


        //foreach遍历map
        System.out.println("foreach遍历map");
        Person person1 = new Person("xiaoming",7000,23,"男","坊子");
        Person person2 = new Person("xiaohua",12000,24,"男","坊子");
        Person person3 = new Person("xiaoling",8000,23,"nv","坊子");
        Person person4 = new Person("xiaodai",7500,23,"男","坊子");
        HashMap<String, Person> hashMap = new HashMap<>();
        hashMap.put(person1.getName(),person1);
        hashMap.put(person2.getName(),person2);
        hashMap.put(person3.getName(),person3);
        hashMap.put(person4.getName(),person4);

        hashMap.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
