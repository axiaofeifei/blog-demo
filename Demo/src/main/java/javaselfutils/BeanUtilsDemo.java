package javaselfutils;



import org.springframework.beans.BeanUtils;
import unit.Dog;
import unit.DogInfo;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 16:41
 */
public class BeanUtilsDemo
{
    public static void main(String[] args) {
        Dog dog = new Dog("小花",11,"黄");
        Dog dogByCopy = new Dog();
        DogInfo dogInfo = new DogInfo();

        BeanUtils.copyProperties(dog,dogByCopy);
        System.out.println("dogByCopy = " + dogByCopy);


        BeanUtils.copyProperties(dog,dogInfo);
        System.out.println("dogInfo = " + dogInfo);
        //因为age的属性类型不一致，所以不会复制过来
        //dogInfo = DogInfo(name=小花, age=null, color=黄, birthday=null)


    }
}
