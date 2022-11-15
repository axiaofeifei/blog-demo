package com.hhf.springbootshiro.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.hhf.springbootshiro.pojo
 *
 * @author hehongfei
 * @date 2022/6/7 17:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@TableId
	private Integer  id;
	private String   name;
	private String   pwd;
	private String   perms;
}
