package io.stream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 9:53
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        String path = "e:\\io\\create03.txt";
        FileOutputStream fileOutputStream = null;
        String str = "hello,world";
        try {
            //new FileOutputStream(File file,true) 插入的内容设置为追加模式
            //fileOutputStream = new FileOutputStream(new File(path),true);
            fileOutputStream = new FileOutputStream(new File(path));
            fileOutputStream.write(str.getBytes());
            //设置插入文件内容的偏移量
            //fileOutputStream.write(str.getBytes(),0,5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("已在文件内添加内容...");
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
