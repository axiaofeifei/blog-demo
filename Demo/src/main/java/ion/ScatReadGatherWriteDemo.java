package ion;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/12 17:07
 */
public class ScatReadGatherWriteDemo {

    @Test
    public void test() throws IOException {
        String srcFile = "E:\\工作\\图片\\2022-12\\jwt-token.png";
        String toFile = "E:\\工作\\图片\\2022-12\\jwt-token-6.png";
        FileInputStream is = new FileInputStream(srcFile);
        FileOutputStream os = new FileOutputStream(toFile);

        FileChannel inChannel = is.getChannel();
        FileChannel outChannel = os.getChannel();

        // 获得多个缓冲区，并且放入到缓冲区数组中
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(50);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1024);
        ByteBuffer[] byteBuffers = {byteBuffer1, byteBuffer2};

        // 分散读取
        inChannel.read(byteBuffers);

        byteBuffer1.flip();
        byteBuffer2.flip();

        // 聚集写入
        outChannel.write(byteBuffers);
    }

}
