package io.filebase;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 8:32
 */
public class FileInfo {
    public static void main(String[] args) {

    }

    @Test
    public void getFileInfo() throws IOException {
        File file = new File("e:\\io\\create.txt");
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("file.getCanonicalFile() = " + file.getCanonicalFile());
        System.out.println("file.getParentFile() = " + file.getParentFile());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
    }
}
