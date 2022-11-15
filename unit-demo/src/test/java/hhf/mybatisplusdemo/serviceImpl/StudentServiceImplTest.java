package hhf.mybatisplusdemo.serviceImpl;

import hhf.mybatisplusdemo.BaseTest;
import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.service.IStudentService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * hhf.mybatisplusdemo.serviceImpl
 *
 * @author hehongfei
 * @date 2022/6/2 14:52
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
class StudentServiceImplTest extends BaseTest {
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