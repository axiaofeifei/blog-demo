package hhf.mybatisplusdemo.service;

import hhf.mybatisplusdemo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import hhf.mybatisplusdemo.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import javax.annotation.Resource;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Service
public interface IStudentService extends IService<Student> {


	Student getOneById(Integer id);
}
