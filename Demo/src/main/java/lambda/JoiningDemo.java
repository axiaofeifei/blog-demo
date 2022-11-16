package lambda;


import unit.Person;
import unit.PersonList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:23
 */
public class JoiningDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        for (Person person : new PersonList().supplier.get()) {
            people.add(person);
        }


        String stringStream = people.stream().map(n -> n.getName()).collect(Collectors.joining("--"));
        String collect = people.stream().map(Person::getGender).collect(Collectors.joining("-"));

    }
}
