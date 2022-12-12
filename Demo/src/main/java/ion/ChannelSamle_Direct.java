package ion;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/12 15:06
 */
public class ChannelSamle_Direct {

    @Test
    public void Test() throws IOException {
        // 通过open()方法来获得通道
        String srcFile = "E:\\工作\\图片\\2022-12\\jwt-token.png";
        FileChannel inChannel = FileChannel.open(Paths.get(srcFile), StandardOpenOption.READ);

        // outChannel需要为 READ WRITE CREATE模式
        // READ WRITE是因为后面获取直接缓冲区时模式为READ_WRITE模式
        // CREATE是因为要创建新的文件
        String toFile = "E:\\工作\\图片\\2022-12\\jwt-token-copy2.png";

        FileChannel outChannel = FileChannel.open(Paths.get(toFile), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // 获得直接缓冲区
        MappedByteBuffer inMapBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMapBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        // 字节数组
        byte[] bytes = new byte[inMapBuf.limit()];

        // 因为是直接缓冲区，可以直接将数据放入到内存映射文件，无需通过通道传输
        inMapBuf.get(bytes);
        outMapBuf.put(bytes);

        // 关闭缓冲区，这里没有用try-catch-finally
        inChannel.close();
        outChannel.close();
        System.out.println("文件copy成功...");
    }
}
