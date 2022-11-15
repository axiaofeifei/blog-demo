package com.hhf.springbootshiro.service;

import com.hhf.springbootshiro.BaseTest;
import com.hhf.springbootshiro.SpringbootShiroApplication;
import com.hhf.springbootshiro.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * com.hhf.springbootshiro.service
 *
 * @author hehongfei
 * @date 2022/6/8 15:38
 */
@SpringBootTest(classes = SpringbootShiroApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest extends BaseTest {

	@Resource
	private UserService userService;

	@Test
	public void setUserServiceTest(){

		init();

		User user = userService.getById(1);
		System.out.println(user);

		after();
	}

}
