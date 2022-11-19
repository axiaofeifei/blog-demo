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

    @Override
    public Students getById(Serializable id) {
        Students stu = studentsMapper.selectById(id);
        return stu;
    }

    /**
     * 根据queryWrapper传来的内容查询数据库
     * @param queryWrapper
     * @return
     */
    @Override
    public Students getOne(Wrapper<Students> queryWrapper) {
        Students students = studentsMapper.selectOne(queryWrapper);
        return students;
    }

    @Override
    public boolean removeById(Serializable id) {
        System.out.println("------------------------"+id);
        int i = studentsMapper.deleteById(id);
        System.out.println("-----------------------------"+i);

        return true;
    }

    @Override
    public Students getOne(Wrapper<Students> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Students> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    /**
     * 根据传入的条件查询
     * @param columnMap
     * @return
     */
    @Override
    public List<Students> listByMap(Map<String, Object> columnMap) {
        List<Students> studentsList = studentsMapper.selectByMap(columnMap);

        return studentsList;
    }



    @Override
    public <E extends IPage<Students>> E page(E page) {
        QueryWrapper<Students> queryWrapper = new QueryWrapper<>();
        E e = studentsMapper.selectPage(page, queryWrapper);
        return e;
    }

    //    传入指定条件查询，返回List<Map<String, Object>>
    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Students> queryWrapper) {
        List<Map<String, Object>> maps = studentsMapper.selectMaps(queryWrapper);
        return maps;
    }

    //    按照某一种要求  查询所有符合要求的学生
    @Override
    public List<Students> list(Wrapper<Students> queryWrapper) {
//       queryWrapper参数包含了传输过来的要求
        List<Students> studentsList = studentsMapper.selectList(queryWrapper);

        return studentsList;
    }

    /**
     * mapper调用实现查询所有学生
     * @return
     */
    @Override
    public List<Students> list() {
//        表示所有学生
        QueryWrapper<Students> queryWrapper = new QueryWrapper<Students>();
        List<Students> studentsList = studentsMapper.selectList(queryWrapper);
        return studentsList;
    }



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
