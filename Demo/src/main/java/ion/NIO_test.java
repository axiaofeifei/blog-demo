package ion;

import com.sun.javafx.logging.Logger;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 11:14
 */
public class NIO_test {

    @Test
    public void test() throws IOException {
        String srcFile = "e:\\codes\\hhf\\0-files\\nio-test.txt";
        //文件与内存之间建立管道
        RandomAccessFile file = new RandomAccessFile(srcFile, "rw");
        FileChannel channel = file.getChannel();
        //缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.mark();
        buffer.position();
        buffer.limit();
        buffer.capacity();
        do{
            //内存一次读取多少内容缓冲区说了算
            //buffer读取数据
            //channel与buffer建立连接
            int readLen = channel.read(buffer);
            System.out.println("读到字节数:"+readLen) ;
            if (readLen == -1) {
                break;
            }
            buffer.flip();
            while(buffer.hasRemaining()) {
                System.out.println((char)buffer.get());

            }
            // 切换 buffer 写模式
            buffer.clear();
        }while (true);

    }
}
