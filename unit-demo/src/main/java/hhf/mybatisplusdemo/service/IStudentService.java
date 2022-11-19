package hhf.mybatisplusdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import hhf.mybatisplusdemo.entity.Students;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Service
public interface IStudentService extends IService<Students> {


	Students getOneById(Integer id);
}
