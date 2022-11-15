package hhf.mybatisplusdemo.serviceImpl;

import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.mapper.StudentMapper;
import hhf.mybatisplusdemo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Service("IStudentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

	@Resource
	private StudentMapper studentMapper;


	@Override
	public Student getOneById(Integer id) {
		Student student = studentMapper.selectOneById(id);
		return student;
	}
}
