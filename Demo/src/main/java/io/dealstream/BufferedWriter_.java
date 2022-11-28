package io.dealstream;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 16:47
 */
public class BufferedWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        String path = "e:\\io\\toFile.txt";
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write('H');
            bufferedWriter.newLine();
            bufferedWriter.write("道可道，非常道");
            bufferedWriter.newLine();
            bufferedWriter.write("hello,world",0,4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("文件写入完毕,关闭流...");
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
