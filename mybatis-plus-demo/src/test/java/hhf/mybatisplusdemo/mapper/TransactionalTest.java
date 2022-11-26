package hhf.mybatisplusdemo.mapper;

import hhf.mybatisplusdemo.entity.Students;
import hhf.mybatisplusdemo.tool.StudentsList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/26 8:40
 */
@SpringBootTest
public class TransactionalTest {
    @Resource
    private StudentsMapper studentsMapper;

    @Test
    @Transactional
    public void test(){
        List<Students> students = new StudentsList().supplier.get();

        studentsMapper.insert(students.get(1));
        studentsMapper.insert(students.get(2));
        //int i = 1/0;
        studentsMapper.insert(students.get(3));
    }
}
