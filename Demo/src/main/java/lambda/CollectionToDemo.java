package lambda;


import unit.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 11:22
 */

/**
 * 归集(toList/toSet/toMap)
 */
public class CollectionToDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
        //toList
        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        //toSet
        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        //toMap
        Map<?, Person> map = personList.stream().filter(p -> p.getSalary() > 8000)
                .collect(Collectors.toMap(Person::getName, p -> p));

        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("toList:" + listNew);
        System.out.println("toSet:" + set);
        System.out.println("toMap:" + map);
    }
}
