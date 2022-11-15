package hhf.mybatisplusdemo.service;

import hhf.mybatisplusdemo.BaseTest;
import hhf.mybatisplusdemo.MybatisPlusDemoApplication;
import hhf.mybatisplusdemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * hhf.mybatisplusdemo.service
 *
 * @author hehongfei
 * @date 2022/6/2 15:25
 */
@SpringBootTest(classes = MybatisPlusDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
class IStudentServiceTest extends BaseTest {

	@Resource
	private IStudentService iStudentService;

	@Test
	void getOneById() {
		init();

		Student oneById = iStudentService.getOneById(4);
		System.out.println(oneById);

		after();
	}
}