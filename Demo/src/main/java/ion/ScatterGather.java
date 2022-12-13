package ion;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 11:35
 */
public class ScatterGather {
    @Test
    public void test(){
        String srcFile = "E:\\工作\\图片\\2022-12\\jwt-token.png";

        try (RandomAccessFile file = new RandomAccessFile(srcFile, "rw")) {
            FileChannel channel = file.getChannel();
            ByteBuffer a = ByteBuffer.allocate(3);
            ByteBuffer b = ByteBuffer.allocate(3);
            ByteBuffer c = ByteBuffer.allocate(5);
            channel.read(new ByteBuffer[]{a, b, c});
            a.flip();
            b.flip();
            c.flip();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        String srcFile = "e:\\codes\\hhf\\0-files\\nio-test.txt";

        try (RandomAccessFile file = new RandomAccessFile(srcFile, "rw")) {
            FileChannel channel = file.getChannel();
            ByteBuffer d = ByteBuffer.allocate(4);
            ByteBuffer e = ByteBuffer.allocate(4);
            channel.position(11);

            d.put(new byte[]{'f', 'o', 'u', 'r'});
            e.put(new byte[]{'f', 'i', 'v', 'e'});
            d.flip();
            e.flip();
            //System.out.println(d);
            //System.out.println(e);
            channel.write(new ByteBuffer[]{d, e});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
