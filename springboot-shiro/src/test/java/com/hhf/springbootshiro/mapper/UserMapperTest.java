package com.hhf.springbootshiro.mapper;

import com.hhf.springbootshiro.BaseTest;
import com.hhf.springbootshiro.SpringbootShiroApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * com.hhf.springbootshiro
 *
 * @author hehongfei
 * @date 2022/6/8 14:45
 */
@SpringBootTest(classes = SpringbootShiroApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest extends BaseTest {

	@Resource
	private UserMapper userMapper;

	@Test
	public void test(){
		init();
		System.out.println(userMapper.toString());
		after();
	}
}
