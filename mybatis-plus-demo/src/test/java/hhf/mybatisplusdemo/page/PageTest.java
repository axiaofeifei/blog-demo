package hhf.mybatisplusdemo.page;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hhf.mybatisplusdemo.entity.Students;
import hhf.mybatisplusdemo.mapper.StudentsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/22 8:26
 */
@SpringBootTest
public class PageTest {
    @Resource
    private StudentsMapper studentsMapper;

    @Test
    void testPage(){
        Page<Students> studentsPage = new Page<>(2, 5);
        Page<Students> studentsPages = studentsMapper.selectPage(studentsPage, null);
        System.out.println("studentsPages = " + studentsPages);

        System.out.println("studentsPages.getPages() = " + studentsPages.getPages());
        System.out.println("studentsPages.getRecords() = " + studentsPages.getRecords());
        System.out.println("studentsPages.getCurrent() = " + studentsPages.getCurrent());
        System.out.println("studentsPages.getTotal() = " + studentsPages.getTotal());
        System.out.println("studentsPages.getSize() = " + studentsPages.getSize());
    }

    @Test
    void testSelfPage(){
        Page<Students> studentsPage = new Page<>(1,4);
        Page<Students> studentsPages = studentsMapper.selectPageVo(studentsPage, 23);

        System.out.println("studentsPages.getPages() = " + studentsPages.getPages());
        System.out.println("studentsPages.getRecords() = " + studentsPages.getRecords());
        System.out.println("studentsPages.getCurrent() = " + studentsPages.getCurrent());
        System.out.println("studentsPages.getTotal() = " + studentsPages.getTotal());
        System.out.println("studentsPages.getSize() = " + studentsPages.getSize());


    }
}
