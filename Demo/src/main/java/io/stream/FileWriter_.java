package io.stream;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 15:54
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\toFile.txt";
        char[] charData = {'a','b','c'};
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(path,true);
            //写入单个字符
            fileWriter.write('H');
            //写入字符数组
            fileWriter.write(charData);
        //  写入字符串
            fileWriter.write("天地无极，乾坤借法");
        //    写入字符数组有偏移量
            fileWriter.write(charData,0,2);
        //    写入字符串有偏移量
            fileWriter.write("天地无极，乾坤借法",0,4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("数据写入完成...,关闭流");
            if (fileWriter != null) {
                try {
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
