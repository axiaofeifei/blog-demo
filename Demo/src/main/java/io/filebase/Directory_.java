package io.filebase;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/28 8:38
 */
public class Directory_ {
    public static void main(String[] args) {

    }
//    mkdir创建单级目录，mkdirs创建多级目录，delete
//    判断e:\\io\\create.txt是否存在，如果存在就删除
    @Test
    public void m1(){
        File file = new File("e:\\io\\create.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("文件已删除...");
        }else {
            System.out.println("e:\\io\\create.txt...文件不存在");
        }

    }

    //    判断e:\\0_test是否存在，如果存在就删除
    @Test
    public void m2(){
        String path = "e:\\0_test";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            System.out.println("目录0_test已删除...");
        }else {
            System.out.println("要删除的目录不存在...");
        }
    }
    //e:\\a\\b\\c判断目录是否存在，如果存在就就提示存在，如果不存在就创建
    @Test
    public void m3(){
        String path = "e:\\a\\b\\c";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("文件已存在...");
        }else {
            if (file.mkdirs()) {
                System.out.println("文件创建成功...");
            }else {
                System.out.println("文件创建失败...");
            }
        }
    }
}
