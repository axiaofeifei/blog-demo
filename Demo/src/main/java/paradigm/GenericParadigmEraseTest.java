package paradigm;

import unit.Dog;
import unit.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/2 10:20
 * 泛型擦除
 */
public class GenericParadigmEraseTest {
    public static void main(String[] args) {
        Dog dog = new Dog("huahua", 12, "灰");
        Person person = new Person("小红",2000,23,"女","森林");

        List<Person> personList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        // personList.add(dog);

        System.out.print("personList.getClass() == dogList.getClass() : "  );
        System.out.println(personList.getClass() == dogList.getClass());

    }


}
