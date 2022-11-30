package io.transform;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 8:18
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "e:\\io\\create02.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path,true),"utf-8"));

        bufferedWriter.write("hello,miaomiaomiao");

        bufferedWriter.close();
    }
}
