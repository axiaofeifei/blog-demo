package io.stream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 10:38
 */
public class FileInputStream_buf {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        String path = "e:\\io\\create02.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        byte[] buf = new byte[1024];
        try {
            fileInputStream = new FileInputStream(new File(path));

            while ((readData = fileInputStream.read(buf)) != -1) {
                System.out.println((char)readData);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
