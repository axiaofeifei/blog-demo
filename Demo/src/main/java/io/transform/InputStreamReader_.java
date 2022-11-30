package io.transform;

import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 8:09
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String path = "e:\\io\\create02.txt";
        //字节流文件读取
        //FileInputStream fileInputStream = new FileInputStream(path);
        //字节流转换为字符流，并指定编码格式
        //InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "gbk");
        //使用缓冲字符流，提高速度
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"gbk"));

        String s = bufferedReader.readLine();
        System.out.println("读取的内容 = " + s);

        bufferedReader.close();
    }
}
