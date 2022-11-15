package hhf.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import hhf.mybatisplusdemo.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 11:13
 */
@Service
public interface StudentsService extends IService<Student> {

    Page<Student> pageList(QueryWrapper<Student> queryWrapper);
}
