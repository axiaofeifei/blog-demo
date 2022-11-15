package hhf.mybatisplusdemo;

import org.junit.After;
import org.junit.Before;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * hhf.mybatisplusdemo
 *
 * @author hehongfei
 * @date 2022/6/2 9:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {

	protected Logger logger = LoggerFactory.getLogger(BaseTest.class);

	@Before
	public void init() {
		logger.info("开始测试...................");
	}

	@After
	public void after() {
		logger.info("测试结束...................");
	}
}
