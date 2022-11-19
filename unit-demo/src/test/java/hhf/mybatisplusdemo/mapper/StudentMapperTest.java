package hhf.mybatisplusdemo.mapper;

import hhf.mybatisplusdemo.BaseTest;
import hhf.mybatisplusdemo.MybatisPlusDemoApplication;
import hhf.mybatisplusdemo.entity.Students;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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

		Students student = studentMapper.selectOneById(5);

		after();
	}
	@Test
	void insert(){
		Students students = new Students( );
		students.setId(56);
		students.setStuNum(123L);
		students.setStuName("张雪婷");
		students.setAge(25L);
		students.setGender("女");
		students.setBirthday("19951203");
		int result = studentMapper.insert(students);
		System.out.println("result = " + result);
	}
}