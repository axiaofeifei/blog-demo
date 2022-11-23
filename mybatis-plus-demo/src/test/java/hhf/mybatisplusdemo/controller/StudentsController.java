package hhf.mybatisplusdemo.controller;

import hhf.mybatisplusdemo.entity.Students;
import hhf.mybatisplusdemo.service.StudentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/19 15:07
 */
@SpringBootTest
public class StudentsController {

    @Resource
    private StudentsService studentsService;

    @Test
    void save(){
        //List<Students> students = new StudentsList().supplier.get();
        ArrayList<Students> students = new ArrayList<>();
        for (Long i = 100L; i < 200; i++) {
            int j =100;
            j = j+1;
            //Students student = new Students(j, (Long) i, i + "name", i, "女", i + "");
            //students.add(student);
        }
        studentsService.saveBatch(students);
    }
}
