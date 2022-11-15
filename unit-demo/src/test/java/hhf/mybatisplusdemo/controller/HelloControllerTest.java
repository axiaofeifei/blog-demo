package hhf.mybatisplusdemo.controller;

import hhf.mybatisplusdemo.BaseTest;
import hhf.mybatisplusdemo.MybatisPlusDemoApplication;
import javafx.application.Application;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

/**
 * hhf.mybatisplusdemo.controller
 *
 * @author hehongfei
 * @date 2022/6/2 9:57
 */
@SpringBootTest(classes = MybatisPlusDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
class HelloControllerTest extends BaseTest {

	@Autowired
	private HelloController helloController;
	@Resource
	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
	}

	//无参构造方法
	@Test
	public void hello() throws Exception {

			init();

			MvcResult mvcResult = mockMvc
					.perform(MockMvcRequestBuilders
					.get("/hello/mybatis/"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andDo(MockMvcResultHandlers.print())
					.andReturn();

			logger.info(mvcResult.getResponse().getContentAsString());

			after();

	}

}