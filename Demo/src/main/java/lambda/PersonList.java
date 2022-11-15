package test.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 13:51
 */
public class PersonList {
    public Supplier<ArrayList<Person>> supplier = ()->{
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("xiaoming",7000,23,"男","坊子"));
        people.add(new Person("xiaohua",12000,24,"男","坊子"));
        people.add(new Person("xiaoling",8000,23,"nv","坊子"));
        people.add(new Person("xiaodai",7500,23,"男","坊子"));

        return people;
    };
}
