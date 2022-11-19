package hhf.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import hhf.mybatisplusdemo.MybatisPlusDemoApplication;
import hhf.mybatisplusdemo.entity.Students;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/18 9:18
 */
@SpringBootTest
public class StundentsMapperTest {
    @Resource
    private StudentsMapper studentsMapper;

    @Test
    void insert(){
        Students students = new Students( );
        students.setId(53);
        students.setStuNum(123L);
        students.setStuName("张雪婷");
        students.setAge(25L);
        students.setGender("女");
        students.setBirthday("19951203");
        int result = studentsMapper.insert(students);
        System.out.println("result = " + result);
    }


    @Test
    void select(){
        Students students = studentsMapper.selectById(12);
        System.out.println("students = " + students);

        List<Integer> listId = Arrays.asList(1, 2, 3);
        List<Students> studentsList = studentsMapper.selectBatchIds(listId);
        for (Students students1 : studentsList) {
            System.out.println("students1 = " + students1);
        }

        //可以一次查多条数据，也可以只拿确切的一条数据
        HashMap<String, Object> map = new HashMap<>();
        //map.put("stu_name","乔莉");
        map.put("stu_name","张雪婷");
        map.put("id",53);
        List<Students> students1 = studentsMapper.selectByMap(map);
        for (Students students2 : students1) {
            System.out.println("students2 = " + students2);
        }
    }

    @Test
    void selectWrap(){
        QueryWrapper<Students> wrapper = new QueryWrapper<>();
        wrapper.eq("stu_name","张雪婷");
        Long aLong = studentsMapper.selectCount(wrapper);
        System.out.println("aLong = " + aLong);

    }
    @Test
    void delete(){
        //根据id删除
        //int result = studentsMapper.deleteById(2);
        //System.out.println("result = " + result);

        //根据实体类删除
        //Students students = new Students();
        //students.setId(3);
        //students.setStuName("tom");
        //int  i = studentsMapper.deleteById(students);
        //System.out.println("i = " + i);

        //根据map条件删除
        HashMap<String, Object> map = new HashMap<>();
        map.put("stu_name","杰克");
        int i = studentsMapper.deleteByMap(map);
        System.out.println("i = " + i);

        List<Integer> asList = Arrays.asList(4, 5, 6);
        int result = studentsMapper.deleteBatchIds(asList);
        System.out.println("result = " + result);

    }

    @Test
    void update(){
        Students students = new Students();
        students.setId(13);
        students.setGender("男");
        students.setStuName("老单");
        int i = studentsMapper.updateById(students);
        System.out.println("i = " + i);


    }
}
