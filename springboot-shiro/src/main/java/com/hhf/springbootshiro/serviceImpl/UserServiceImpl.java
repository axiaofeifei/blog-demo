package com.hhf.springbootshiro.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhf.springbootshiro.entity.User;
import com.hhf.springbootshiro.mapper.UserMapper;
import com.hhf.springbootshiro.service.UserService;
import org.springframework.stereotype.Service;

/**
 * com.hhf.springbootshiro.serviceImpl
 *
 * @author hehongfei
 * @date 2022/6/8 14:34
 */
@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
