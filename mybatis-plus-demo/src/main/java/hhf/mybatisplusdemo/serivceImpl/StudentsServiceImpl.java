package hhf.mybatisplusdemo.serivceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hhf.mybatisplusdemo.mapper.StudentsMapper;
import hhf.mybatisplusdemo.entity.Students;

import hhf.mybatisplusdemo.service.StudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 14:05
 */
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students> implements StudentsService {
    @Resource
    private StudentsMapper studentsMapper;



    @Resource
    private StudentsService studentsService;






    @Override
    public Class<Students> getEntityClass() {
        return null;
    }


    @Override
    public Page<Students> pageList(QueryWrapper<Students> queryWrapper) {
        Page<Students> studentPage = new Page<>();
        Page<Students> studentPage1 = studentsMapper.selectPage(studentPage, queryWrapper);
        return studentPage1;
    }
}
