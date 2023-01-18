/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:20
 */

package com.example.springbootmuldatasources.service;

import com.example.springbootmuldatasources.entity.Dog;
import org.springframework.stereotype.Service;

@Service
public interface DogService {

    Dog getByName(String name);

}
