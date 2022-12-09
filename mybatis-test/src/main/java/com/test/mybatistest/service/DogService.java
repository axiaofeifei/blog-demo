/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:20
 */

package com.test.mybatistest.service;

import com.test.mybatistest.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface DogService {

    Dog getByName(String name);

}
