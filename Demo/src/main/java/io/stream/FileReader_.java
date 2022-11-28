package io.stream;

import org.apache.coyote.http11.filters.VoidOutputFilter;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 15:41
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    //读取单个字符
    @Test
    public void test(){
        String path = "e:\\io\\srcFile.txt";
        FileReader fileReader = null;
        int readData = 0;
        try {
            fileReader = new FileReader(path);
            while ((readData = fileReader.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    //字符数组读取文件
    @Test
    public void test02(){
        String path = "e:\\io\\srcFile.txt";
        FileReader fileReader = null;
        char[] buf = new char[1024];
        int readLen = 0;
        try {
            fileReader = new FileReader(path);
            while ((readLen = fileReader.read(buf)) != -1) {
                //因为读取的可能不够1024个，所以用readLen作为截至
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
