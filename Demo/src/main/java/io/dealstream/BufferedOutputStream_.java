package io.dealstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/29 11:20
 */
public class BufferedOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\bufferedFile.txt";
        BufferedOutputStream bufferedOutputStream = null;
        byte[] buf = {'a','b','c'};
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(path),true));
            bufferedOutputStream.write('H');
            bufferedOutputStream.write(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                    System.out.println("数据写入成功，并以关闭流......");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
