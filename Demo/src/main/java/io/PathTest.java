package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description  根据需求创建文件
 * @Date 2022/11/8 9:47
 */

public class PathTest {
    public static void main(String[] args) throws IOException {
        String path = "E:\\codes\\gs\\python-gs\\separation\\separation\\src\\";
        ArrayList<String> listFileName = new ArrayList<>();
        listFileName.add("文件名");
        //拼接相应的文件名
        ArrayList<String> listPath = new ArrayList<>();
        for (int i = 0; i < listFileName.size(); i++) {
            listPath.add(path+listFileName.get(i)+".docx");
        }

        for (int i = 0; i < listFileName.size(); i++) {
            Files.write(Paths.get(listPath.get(i)), listFileName.get(i).toString().getBytes());

        }



    }
}
