package ion;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/14 9:44
 */
public class Paths_test {

    @Test
    public void test() throws IOException {
        Path path = Paths.get("src/main/java/ion/AllocateDemo.java");
        System.out.println(path);

        Path path1 = Paths.get("Demo/src/main/java/ion/AllocateDemo.java");
        System.out.println(path1);

        Path path2 = Paths.get("E:\\codes\\hhf\\blog-demo\\Demo\\src\\main\\java\\ion\\AllocateDemo.java");
        System.out.println(path2);

        boolean exists = Files.exists(path);
        System.out.println(exists);

        Path path3 = Paths.get("E:\\codes\\hhf\\0-files\\a");
        Files.createDirectory(path3);

        Path path4 = Paths.get("E:\\codes\\hhf\\0-files\\b\\c\\d");
        Path directories = Files.createDirectories(path4);

        Path path5 = Paths.get("E:\\codes\\hhf\\0-files\\nio-test.txt");
        Path path6 = Paths.get("E:\\codes\\hhf\\0-files\\nio-test-copy.txt");
        Files.copy(path5,path6);
    //    Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    //    Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);

        Files.delete(path6);
        Files.delete(path4);

    }
}
