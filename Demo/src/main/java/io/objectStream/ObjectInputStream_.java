package io.objectStream;

import org.junit.jupiter.api.Test;
import unit.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/29 14:55
 */
public class ObjectInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\dog.txt";
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream(path));
            //System.out.println("ois.readInt() = " + ois.readInt());
            //System.out.println("ois.readBoolean() = " + ois.readBoolean());
            //System.out.println("ois.readByte() = " + ois.readByte());
            //System.out.println("ois.readChar() = " + ois.readChar());
            //System.out.println("ois.readDouble() = " + ois.readDouble());
            Object dog = ois.readObject();
            System.out.println("dogs.getClass() = " + dog.getClass());
            System.out.println("dogs = " + dog);


            //1.如果我们希望调用Dog的方法，需要向下转型
            //2.需要我们将Dog类的定义，放到可以引用的位置（所以我们需要将Dog类单独搞成一个公开的类）
            Dog dog2 = (Dog) dog;
            System.out.println(dog2.getName());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
