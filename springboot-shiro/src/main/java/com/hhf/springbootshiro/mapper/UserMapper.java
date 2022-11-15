package com.hhf.springbootshiro.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhf.springbootshiro.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * com.hhf.springbootshiro.mapper
 *
 * @author hehongfei
 * @date 2022/6/8 14:30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
