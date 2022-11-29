package io.objectStream;

import org.junit.jupiter.api.Test;
import unit.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/29 15:19
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\dog.txt";
        Dog dog = new Dog("小黄", 2, "黄");
        ObjectOutputStream oom = null;
        try {
            oom = new ObjectOutputStream(new FileOutputStream(path));
            oom.writeObject(dog);

            //oom.writeByte('a');
            //oom.writeBytes("何洪飞，你就是个傻叉");
            //oom.writeBoolean(false);
            //oom.writeDouble(12.9);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oom != null) {
                try {
                    oom.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("内容已写入，并已关闭流...");
        }
    }
}
