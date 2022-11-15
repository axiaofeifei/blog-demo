package hhf.mybatisplusdemo.controller;

import hhf.mybatisplusdemo.BaseTest;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * hhf.mybatisplusdemo.controller
 *
 * @author hehongfei
 * @date 2022/6/2 9:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest extends BaseTest {


	@Autowired
	private StudentController studentController;
	@Resource
	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
	}


	//有参方法测试
	@Test
	public void getOne() throws Exception{
		init();

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/student/getOne")
				.accept(MediaType.APPLICATION_JSON).param("id", "3"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();


		logger.info(mvcResult.getResponse().getContentAsString());

		after();

	}


	//有参方法测试Test         controller是get方法，测试时使用了post方法报错
	@Test
	public void getOneTest() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/student/getOne")
				.accept(MediaType.APPLICATION_JSON).param("id", "3"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();


		logger.info(mvcResult.getResponse().getContentAsString());

	}


}