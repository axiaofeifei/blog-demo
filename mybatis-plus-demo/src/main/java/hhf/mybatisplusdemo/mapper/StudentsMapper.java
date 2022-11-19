/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/18 10:25
 */

package hhf.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import hhf.mybatisplusdemo.entity.Students;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsMapper extends BaseMapper<Students> {
}
