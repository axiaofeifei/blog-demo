package reflect;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.ApiModelProperty;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/30 8:18
 */
public class GetValue {
    @Test
    public void test(){



        Properties dingLinkMessageModel = getApiModelProperty("src.main.java.reflect.Dog");
        ////Properties dingLinkMessageModel = getApiModelProperty("E:\\codes\\hhf\\blog-demo\\Demo\\src\\main\\java\\reflect\\Dog.java");
        ////Properties dingLinkMessageModel = getApiModelProperty("Demo/src/main/java/reflect/Dog.java");
        System.out.println(dingLinkMessageModel);


        Dog dog = new Dog();
        Class<? extends Dog> aClass = dog.getClass();

        Properties apiModelProperty2 = getApiModelProperty2(aClass);
        System.out.println(apiModelProperty2);
    }



    //使用类路径打印@ApiModelProperty的value值
    public static Properties getApiModelProperty(String classPath) {
        Properties p = new Properties();
        try {
            // 1.根据类路径获取类
            Class<?> c = Class.forName(classPath);
            // 2.获取类的属性
            Field[] declaredFields = c.getDeclaredFields();
            // 3.遍历属性，获取属性上ApiModelProperty的值，属性的名，存入Properties
            if (declaredFields.length != 0) {
                for (Field field : declaredFields) {
                    if (field.getAnnotation(ApiModelProperty.class) != null) {
                        // key和value可根据需求存
                        // 这存的key为注解的值，value为类属性名
                        p.put(field.getAnnotation(ApiModelProperty.class).value(), field.getName());
                    }
                }
                return p;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //使用类的实例去打印@ApiModelProperty的value值
    public static Properties getApiModelProperty2(Class classT) {
        Properties p = new Properties();

        // 2.获取类的属性
        Field[] declaredFields =classT.getDeclaredFields();
        // 3.遍历属性，获取属性上ApiModelProperty的值，属性的名，存入Properties
        if (declaredFields.length != 0) {
            for (Field field : declaredFields) {
                if (field.getAnnotation(ApiModelProperty.class) != null) {
                    // key和value可根据需求存
                    // 这存的key为注解的值，value为类属性名
                    p.put(field.getAnnotation(ApiModelProperty.class).value(), field.getName());
                }
            }
            return p;
        }
        return null;
    }


    //属性（属性的解释）：属性的值
    public static Properties logPasteValue(Class classT,String json) {
        Properties p = new Properties();

        // 2.获取类的属性
        Field[] declaredFields =classT.getDeclaredFields();
        // 3.遍历属性，获取属性上ApiModelProperty的值，属性的名，存入Properties
        if (declaredFields.length != 0) {
            for (Field field : declaredFields) {
                if (field.getAnnotation(ApiModelProperty.class) != null) {
                    // key和value可根据需求存
                    // 这存的key为注解的值，value为类属性名
                    String k = field.getName()+"("+field.getAnnotation(ApiModelProperty.class).value()+")";
                    String v = JSONObject.parseObject(json).getString(field.getName());
                    p.put(k,v);
                }
            }
            return p;
        }
        return null;
    }

}





