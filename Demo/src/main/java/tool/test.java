package tool;

import java.io.File;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 16:26
 */
public class test {
    public static void main(String[] args) {
        //DeleteFile deleteFile = new DeleteFile();
        //String path = "E:\\codes\\hhf\\cloud-platform";
        //boolean b = deleteFile.deleteAllFile(path, false);
        //System.out.println("b = " + b);

        File file = new File("E:\\codes\\hhf\\cloud-platform");//输入要删除文件目录的绝对路径
        DeleteFilestore deleteFilestore = new DeleteFilestore();
        Boolean aBoolean = deleteFilestore.deleteFile(file);
        if (aBoolean)
            System.out.println("文件删除成功！");

    }
}
