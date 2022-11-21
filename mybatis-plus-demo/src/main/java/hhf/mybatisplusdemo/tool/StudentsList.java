package hhf.mybatisplusdemo.tool;

import hhf.mybatisplusdemo.entity.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/19 15:13
 */
public class StudentsList {
    public Supplier<List<Students>> supplier = () -> {
        ArrayList<Students> students = new ArrayList<>();
        Students student1 = new Students(101L, "于海飞", 23L, "男", "2022-12-2");
        Students student2 = new Students(102L, "尹宇航", 24L, "男", "2022-11-1");
        Students student3 = new Students(104L, "王云腾", 23L, "男", "2022-12-6");
        Students student4 = new Students(109L, "王淑欣", 23L, "女", "2022-11-22");
        Students student5 = new Students(109L, "姜敏", 23L, "女", "2022-10-4");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    };

}
