package hhf.springbootswagger.controller;

import hhf.springbootswagger.entity.Student;
import hhf.springbootswagger.service.StudentsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * hhf.springbootswagger.controller
 *
 * @author hehongfei
 * @date 2022/5/25 16:39
 */
@Api("学生管理相关接口")
@RestController
@RequestMapping("/swagger")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * 增加用户
     * @param student
     * @return
     */
    @ApiOperation("增加用户")
    @PostMapping("/saveOne")
    public Boolean saveOne(@PathParam("id") Student student){
        boolean resule = studentsService.save(student);
        return resule;
    }

    /**
     * 根据数据库id删除用户
     * @param id
     * @return
     */
    @ApiOperation("根据数据库id删除用户")
    @PostMapping("/removeById")
    public Boolean removeById(@PathParam("id") Integer id){
        studentsService.removeById(id);
        if (studentsService.getById(id) == null) {
            return true;
        }
        return false;
    }

    @ApiOperation("修改用户")
    @PostMapping("/updateOne")
    public boolean updateOne(Student student){
        boolean result = studentsService.saveOrUpdate(student);

        return result;
    }


    /**
     * 根据数据库id查找用户
     * @param id
     * @return
     */
    @ApiOperation("根据数据库id查找用户")
    @GetMapping("/getOne")
    public Student getOne(@PathParam("id") Integer id){
        Student student = studentsService.getById(id);
        if (student == null || student.equals("")) {
            System.out.println("student不存在");
        }
        return student;
    }
}
