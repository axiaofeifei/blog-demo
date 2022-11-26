package hhf.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import hhf.mybatisplusdemo.entity.Students;
import org.springframework.stereotype.Service;

import java.rmi.server.ExportException;
import java.sql.SQLException;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 11:13
 */
@Service
public interface StudentsService extends IService<Students> {

    Page<Students> pageList(QueryWrapper<Students> queryWrapper);

    void test() throws Exception;

    void test2();

    void test3();

    void test4();
}
