package hhf.mybatisplusdemo.serivceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.mapper.StudentsMapper;
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
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper,Student> implements StudentsService {
    @Resource
    private StudentsMapper studentsMapper;

    @Override
    public Student getById(Serializable id) {
        Student stu = studentsMapper.selectById(id);
        return stu;
    }

    /**
     * 根据queryWrapper传来的内容查询数据库
     * @param queryWrapper
     * @return
     */
    @Override
    public Student getOne(Wrapper<Student> queryWrapper) {
        Student student = studentsMapper.selectOne(queryWrapper);
        return student;
    }

    @Override
    public boolean removeById(Serializable id) {
        System.out.println("------------------------"+id);
        int i = studentsMapper.deleteById(id);
        System.out.println("-----------------------------"+i);

        return true;
    }

    @Override
    public Student getOne(Wrapper<Student> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Student> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Student> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    /**
     * 根据传入的条件查询
     * @param columnMap
     * @return
     */
    @Override
    public List<Student> listByMap(Map<String, Object> columnMap) {
        List<Student> studentList = studentsMapper.selectByMap(columnMap);

        return studentList;
    }



    @Override
    public <E extends IPage<Student>> E page(E page) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        E e = studentsMapper.selectPage(page, queryWrapper);
        return e;
    }

    //    传入指定条件查询，返回List<Map<String, Object>>
    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Student> queryWrapper) {
        List<Map<String, Object>> maps = studentsMapper.selectMaps(queryWrapper);
        return maps;
    }

    //    按照某一种要求  查询所有符合要求的学生
    @Override
    public List<Student> list(Wrapper<Student> queryWrapper) {
//       queryWrapper参数包含了传输过来的要求
        List<Student> studentList = studentsMapper.selectList(queryWrapper);

        return studentList;
    }

    /**
     * mapper调用实现查询所有学生
     * @return
     */
    @Override
    public List<Student> list() {
//        表示所有学生
        QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
        List<Student> studentList = studentsMapper.selectList(queryWrapper);
        return studentList;
    }



    @Override
    public Class<Student> getEntityClass() {
        return null;
    }


    @Override
    public Page<Student> pageList(QueryWrapper<Student> queryWrapper) {
        Page<Student> studentPage = new Page<>();
        Page<Student> studentPage1 = studentsMapper.selectPage(studentPage, queryWrapper);
        return studentPage1;
    }
}
