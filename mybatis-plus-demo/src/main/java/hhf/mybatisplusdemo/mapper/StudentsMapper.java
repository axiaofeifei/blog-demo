/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/18 10:25
 */

package hhf.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hhf.mybatisplusdemo.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface StudentsMapper extends BaseMapper<Students> {
    Page<Students> selectPageVo(@Param("page") Page<Students> page,@Param("age") Integer age);
}
