package io.dealstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/29 11:38
 */
public class CopyPhoto {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        String srcFile = "e:\\io\\370283199901228931.jpg";
        String toFile = "e:\\io\\photo.jpg";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        int readLen = 0;
        byte[] buf = new byte[1024];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(srcFile)));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(toFile)));

            while ((readLen = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf,0,readLen);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("文件复制成功，关闭输入流输出流......");

        }


    }
}
