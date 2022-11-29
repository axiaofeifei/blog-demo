package io.dealstream;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 17:22
 */
public class BufferedInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        String path = "e:\\io\\bufferedFile.txt";
        BufferedInputStream bufferedInputStream = null;
        byte[] buf = new byte[1024];
        int readLen = 0;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(path)));
            while ((readLen = bufferedInputStream.read(buf)) != -1) {
                System.out.println(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }
}
