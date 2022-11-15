package test.lambda;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 13:48
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,8,6,7,9);
        list.stream().filter(l -> l > 5).forEach(System.out::println);


        ArrayList<Person> people = new PersonList().supplier.get();
        people.stream().filter(person -> person.getAge()>22).forEach(System.out::println);


    }
}
