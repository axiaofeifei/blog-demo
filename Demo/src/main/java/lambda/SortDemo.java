package lambda;


import unit.Person;
import unit.PersonList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:30
 */
public class SortDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        for (Person person : new PersonList().supplier.get()) {
            people.add(person);
        }

//        //按照工资顺序排列
        List<String> collect = people.stream().sorted(Comparator.comparing(Person::getSalary)).map(Person::getName).collect(Collectors.toList());
//        //按照工资倒序排列
//        List<String> collect1 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).map(Person::getName).collect(Collectors.toList());

        List<String> s = people.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName).collect(Collectors.toList());
        List<String> c= people.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge).reversed()).map(Person::getName).collect(Collectors.toList());

    }
}
