package mp_addmethod;

/**
 * @ClassName CustomizedSqlInjector
 * @Description TODO
 * @Author JueYing 2022/1/26 11:57
 * @Version 1.0
 * @since jdk1.8
 */
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import mp_addmethod.InsertBatchMethod;

import java.util.List;

public class CustomizedSqlInjector extends DefaultSqlInjector {
	/**
	 * 如果只需增加方法，保留mybatis plus自带方法，
	 * 可以先获取super.getMethodList()，再添加add
	 */
	@Override
	public List<AbstractMethod> getMethodList(Class<?> mapperClass, TableInfo tableInfo) {
		List<AbstractMethod> methodList = super.getMethodList(mapperClass,tableInfo);
		methodList.add(new InsertBatchMethod());
		return methodList;
	}
}

