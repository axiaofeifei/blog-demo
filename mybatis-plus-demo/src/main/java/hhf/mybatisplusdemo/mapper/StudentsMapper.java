package hhf.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import hhf.mybatisplusdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 11:02
 */
@Mapper
@Component
public interface StudentsMapper extends BaseMapper<Student> {


}
