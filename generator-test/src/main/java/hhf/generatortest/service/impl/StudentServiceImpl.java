package hhf.generatortest.service.impl;

import hhf.generatortest.entity.Student;
import hhf.generatortest.mapper.StudentMapper;
import hhf.generatortest.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
