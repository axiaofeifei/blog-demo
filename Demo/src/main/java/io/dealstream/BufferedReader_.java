package io.dealstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 16:11
 */
//bufferedReader  是处理流，修饰器模式。
public class BufferedReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\srcFile.txt";
        BufferedReader bufferedReader = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            //按行读取，返回为null时，表示文件读取完毕。
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }
}
