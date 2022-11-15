package hhf.springbootswagger.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import hhf.springbootswagger.entity.Student;
import org.mapstruct.Mapper;

/**
 * hhf.springbootswagger.mapper
 *
 * @author hehongfei
 * @date 2022/5/25 16:53
 */
@Mapper
public interface StudentsMapper extends BaseMapper<Student> {

}
