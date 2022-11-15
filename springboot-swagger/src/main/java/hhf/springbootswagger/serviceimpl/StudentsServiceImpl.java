package hhf.springbootswagger.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import hhf.springbootswagger.entity.Student;
import hhf.springbootswagger.service.StudentsService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * hhf.springbootswagger.service
 *
 * @author hehongfei
 * @date 2022/5/25 17:08
 */
@Service
public class StudentsServiceImpl implements StudentsService {
    @Override
    public boolean saveBatch(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Student entity) {
        return false;
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

    @Override
    public BaseMapper<Student> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Student> getEntityClass() {
        return null;
    }
}
