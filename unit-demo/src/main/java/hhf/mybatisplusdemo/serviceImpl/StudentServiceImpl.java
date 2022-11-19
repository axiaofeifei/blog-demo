package hhf.mybatisplusdemo.serviceImpl;

import hhf.mybatisplusdemo.entity.Students;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Students> implements IStudentService {

	@Resource
	private StudentMapper studentMapper;


	@Override
	public Students getOneById(Integer id) {
		Students student = studentMapper.selectOneById(id);
		return student;
	}
}
