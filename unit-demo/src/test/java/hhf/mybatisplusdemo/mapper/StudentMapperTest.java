package hhf.mybatisplusdemo.mapper;

import hhf.mybatisplusdemo.BaseTest;
import hhf.mybatisplusdemo.MybatisPlusDemoApplication;
import hhf.mybatisplusdemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * hhf.mybatisplusdemo.mapper
 *
 * @author hehongfei
 * @date 2022/6/2 15:08
 */
@SpringBootTest(classes = MybatisPlusDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
class StudentMapperTest extends BaseTest {

	@Resource
	private StudentMapper studentMapper;

	@Test
	void selectOneById() {
		init();

		Student student = studentMapper.selectOneById(5);
		System.out.println(student);

		after();
	}
}