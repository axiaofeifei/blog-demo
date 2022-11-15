package hhf.mybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.service.StudentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 11:19
 */
@RequestMapping("/stu")
@RestController
public class StudentsController {
    @Resource
    private StudentsService studentsService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * 根据数据库id删除用户
     * @param id
     * @return
     */
    @GetMapping("/removeById")
    public Boolean removeById(@PathParam("id") Integer id){
        studentsService.removeById(id);
        if (studentsService.getById(id) == null) {
            return true;
        }
        return false;
    }



    @GetMapping("get")
    public Student get(){
        int id = 1;
        Student student = studentsService.getById(id);
        return student;
    }

    /**
     * 根据数据库id查找用户
     * @param id
     * @return
     */
    @GetMapping("getOne")
    public Student getOne(@PathParam("id") Integer id){
        Student student = studentsService.getById(id);
        if (student == null || student.equals("")) {
            System.out.println("student不存在");
        }
        return student;
    }

    /**
     * mybatis-plus测试使用queryWrapper，  根据id查询用户
     * @param id
     * @return
     */
    @GetMapping("/getOneById")
    public Student getOneById(@PathParam("id") Integer id){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        Student student = studentsService.getOne(queryWrapper);
        return student;
    }

    /**
     * 根据学生名查询学生信息
     * @param stuName
     * @return
     */
    @GetMapping("/getOneByStuName")
    public Student getOneById(@PathParam("stuName") String stuName){
//        设置查询条件
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("stu_name",stuName);

        Student student = studentsService.getOne(queryWrapper);
        return student;
    }

    /**
     * 查询所有的学生
     * @return
     */
    @GetMapping("/getStudentList")
    public List<Student> list(){
        ArrayList<Student> students = new ArrayList<>();
        List<Student> list = studentsService.list();
        return list;
    }

    /**
     * 按照性别查询所有符合要求的所有用户
     * @return
     */
    @GetMapping("/getStudentListBySex")
    public List<Student> list(@PathParam("gender") String gender){
//
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("gender", gender);

        List<Student> list = studentsService.list(queryWrapper);
        return list;
    }

    /**
     * 按照年龄查询所有符合要求的所有用户
     * @return
     */
    @GetMapping("/listStudentListByAge")
    public List<Student> listStudentListByAge(@PathParam("age") Integer age){
//
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age", age);

        List<Student> list = studentsService.list(queryWrapper);
        return list;
    }

//   根据指定条件查询列表数据，返回数据类型为Map类型。
    @GetMapping("/listStudentMapByBirthday")
    public List<Map<String, Object>> listStudentMapByBirthday(@PathParam("birthday") String birthday){
//        指定条件
        QueryWrapper<Student> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(Student::getBirthday, birthday);

        List<Map<String, Object>> maps = studentsService.listMaps(queryWrapper);
//遍历输出maps,后台检查
        for (Map<String, Object> map : maps) {
            for (String s : map.keySet()) {
                System.out.print(map.get(s) + "  ");
            }
            System.out.println();
            System.out.println("---------------------------");
        }

        return maps;
    }
//    分页查询
    @GetMapping("/StudentPage")
    public IPage<Student> StudentPage(){
        Page<Student> studentPage = new Page<>();
        studentPage.setSize(10);

        Page<Student> page = studentsService.page(studentPage);
        System.out.println("-----------------------------------");
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
//        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        return page;
    }


    //    根据条件分页查询
    @GetMapping("/StudentPageByGender")
    public IPage<Student> StudentPageBySec(@PathParam("gender") String gender){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("gender", gender);


        IPage<Student> page= studentsService.pageList(queryWrapper);

//        System.out.println("-----------------------------------");
//        System.out.println(page.getCurrent());
//        System.out.println(page.getPages());
//        System.out.println(page.getRecords());
//        System.out.println(page.getSize());
//        System.out.println(page.getTotal());
        return page;
    }




    @GetMapping("saveOneStudent")
    public boolean save(Student student){
        if (studentsService.save(student)) {
            return true;
        }
        return false;
    }


}
