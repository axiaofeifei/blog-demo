package hhf.mybatisplusdemo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.mapper.StudentMapper;
import hhf.mybatisplusdemo.service.IStudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import javax.websocket.server.PathParam;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */

/**
 localhost:8082/student/save
 localhost:8082/student/deleteById
 localhost:8082/student/updateById
 localhost:8082/student/getById
 localhost:8082/student/getOneById
 localhost:8082/student/getOneByStuName
 localhost:8082/student/getStudentListBySex
 localhost:8082/student/listStudentListByAge
 localhost:8082/student/testpage

 */
@RestController
@RequestMapping("/student")
public class StudentController {
	@Resource
	private IStudentService iStudentService;



	@GetMapping("/getOne")
	public JSON getOne(@PathParam("id") Integer id){
		Student student = iStudentService.getOneById(id);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("infor", student.toString());

		return jsonObject;
	}



}
