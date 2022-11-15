package test.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:26
 */
public class ReducingDemo {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        for (Person person : new PersonList().supplier.get()) {
            people.add(person);
        }


        Integer reduce = people.stream().map(Person::getSalary).reduce(1, Integer::sum);
        Integer collect = people.stream().collect(Collectors.reducing(1, Person::getSalary, Integer::sum));

    }
}
