package io.filebase;

import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 8:17
 */
public class FileCreate {
    public static void main(String[] args) {

    }

//    new File(String pathname)
//    new File(File parent,String pathname)
//    new File(String parent,String child)
    @Test
    public void create01(){
        String path = "e:\\io\\create.txt";
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("文件创建成功...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create02(){
        File parentFile = new File("e:\\io");
        String pathName = "create02.txt";
        File file = new File(parentFile,pathName);
        try {
            file.createNewFile();
            System.out.println("create02文件创建成功...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create03(){
        String parentFile = "e:\\io";
        String pathName = "create03.txt";
        File file = new File(parentFile,pathName);
        try {
            file.createNewFile();
            System.out.println("create03文件创建成功...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
