package io.stream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 10:23
 */
public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void copy(){
        String srcFile = "e:\\io\\srcFile.txt";
        String toFile = "e:\\io\\toFile.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int readData = 0;
        byte[] buf = new byte[1024];

        try {
            fileInputStream = new FileInputStream(new File(srcFile));
            fileOutputStream = new FileOutputStream(new File(toFile));
            while ((readData = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf,0,readData);

            }
            System.out.println("文件copy成功......");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
