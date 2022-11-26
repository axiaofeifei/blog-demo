package hhf.mybatisplusdemo.serivceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hhf.mybatisplusdemo.mapper.StudentsMapper;
import hhf.mybatisplusdemo.entity.Students;

import hhf.mybatisplusdemo.service.StudentsService;
import hhf.mybatisplusdemo.tool.StudentsList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.rmi.server.ExportException;
import java.sql.SQLException;
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
    public Class<Students> getEntityClass() {
        return null;
    }


    @Override
    public Page<Students> pageList(QueryWrapper<Students> queryWrapper) {
        Page<Students> studentPage = new Page<>();
        Page<Students> studentPage1 = studentsMapper.selectPage(studentPage, queryWrapper);
        return studentPage1;
    }

    /**
     * 只有抛出runTimeException()和error才会进行回滚
     * 如果要发生其他错误也进行回滚，可以添加参数这样写
     * @Transactional(rollbackFor = Exception.class)
     * @throws Exception
     */
    @Override
    //@Transactional(rollbackFor = Exception.class)
    @Transactional
    public void test() throws Exception {
        List<Students> students = new StudentsList().supplier.get();
        studentsMapper.insert(students.get(1));
        studentsMapper.insert(students.get(2));
        //报错可以发生回滚。
        //int i = 1/0;
        boolean status = true;
        if (status) {
            //抛出RuntimeException，可以发生回滚
            //throw new RuntimeException();

            //抛出SQLExveption,不会发生回滚。如果使用了rollbackfor指定这个抛出，就会进行回滚
            //throw new SQLException("发生了sql异常");

            //抛出ExportException，不会发生回滚
            //throw new ExportException("测试ExportException");

            //Exception，不会发生回滚
            //throw new Exception("测试Exception");
        }

        //异常不要在业务层进行处理，抛到控制层统一进行处理
        if (status){
            try {
                throw new RuntimeException("发生了RuntimeException，" +
                        "本来应该进行回滚..............，但是被捕获处理了spring未识别，因此没有回滚");
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        studentsMapper.insert(students.get(3));
    }

    /**
     * 两个方法都有@Transactional
     * test2()调用test3()
     */
    @Override
    //@Transactional
    public void test2() {
        test3();
    }

    @Override
    @Transactional
    public void test3() {
        List<Students> students = new StudentsList().supplier.get();
        studentsMapper.insert(students.get(1));
        studentsMapper.insert(students.get(2));
        boolean status = true;
        if (status) {
            throw new RuntimeException("抛出运行时异常");
        }
        studentsMapper.insert(students.get(3));
    }

    @Override
    public void test4() {

    }
}
