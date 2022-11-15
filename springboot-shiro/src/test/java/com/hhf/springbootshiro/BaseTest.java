package com.hhf.springbootshiro;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * com.hhf.springbootshiro
 *
 * @author hehongfei
 * @date 2022/6/8 14:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {

	Logger logger = LoggerFactory.getLogger(BaseTest.class);

	@Before
	public void init() {
		logger.info("开始测试...................");
	}

	@After
	public void after() {
		logger.info("测试结束...................");
	}
}

