package structure.combination.sample_2;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 13:44
 */
public class Test_2 {

    @Test
    public void test(){

        //创建一个文件类型
        AbstractFiles f1 = new Folder("主文件夹");
        //创建文件
        AbstractFiles file1= new ImageFile("孙悟空.png");
        AbstractFiles file2= new ImageFile("龙珠.jpg");
        AbstractFiles file3= new ImageFile("帅哥威.gif");
        f1.add(file1);
        f1.add(file2);
        f1.add(file3);
        f1.killVirus();
        System.out.println("------------------------");
        file1.killVirus();
    }
}
