package javaselfutils;

import org.junit.jupiter.api.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 16:18
 */
public class ClassAndFunctionNameTest {

    String name = null;
    @Test
    public void test(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName);

    }

    @Test
    public void test2(){
        System.out.println("name.equals(\"name\") = " + name.equals("name"));

    }
}
