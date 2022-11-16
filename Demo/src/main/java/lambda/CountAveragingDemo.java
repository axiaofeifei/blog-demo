

import unit.Person;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:18
 */
public class CountAveragingDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        // 求总数
        Long count = personList.stream().collect(Collectors.counting());
        long count1 = personList.stream().count();
        // 求平均工资
        Double average = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        Integer sumSalary = personList.stream().map(Person::getSalary).reduce(0, Integer::sum);
        long l = sumSalary / count1;

        // 求最高工资
        Optional<Integer> max = personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compare));
        Integer max1 = personList.stream().map(Person::getSalary).reduce(2, Integer::max);
        // 求工资之和
        Integer sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
        // 一次性统计所有信息
        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));

        System.out.println("员工总数：" + count);
        System.out.println("count1----------->"+count1);
        System.out.println("员工平均工资：" + average);
        System.out.println("l----------->"+l);
        System.out.println("员工最高工资："+max.get());
        System.out.println("max1------------->"+max1);
        System.out.println("员工工资总和：" + sum);
        System.out.println("sumSalary----------->"+sumSalary);
        System.out.println("员工工资所有统计：" + collect);
        System.out.println("---------------------------------------");
        personList.stream().map(Person::getSalary).forEach(System.out::println);


    }
}
