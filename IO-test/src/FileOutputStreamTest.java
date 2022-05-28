import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/18 15:53
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\codes\\blog-demo的测试\\FileOutputStreamTest.txt");
        /*
        这里创建了字节输出流对象 fos
        创建字节输出流对象这里一共有三步操作：
        1.调用了系统功能创建了文件
        2.创建了字节流输出对象
        3.让字节输出流对象指向创建好的文件
         */
        fos.write("\n".getBytes(StandardCharsets.UTF_8));
        //写到低层是97（ASCII码），但是我们打开文件内容是a
        fos.write(97);
//        fos.write(57);
//        fos.write(55);
        fos.write("\n".getBytes(StandardCharsets.UTF_8));

//在文件中以数组的形式输入
        byte[] bys = {97,98,99,100,101};
        fos.write(bys);
        fos.write("\n".getBytes(StandardCharsets.UTF_8));


//将自己想写的内容写到文件中
        for(int i=0;i<10;i++){
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\n".getBytes(StandardCharsets.UTF_8));//  \n换行
        }
        fos.write(97);

        fos.close();//释放资源，关闭此文件输出流释放并与此流相关联的任何系统资源
    }
}
