package ion;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/12 16:51
 */
public class ChannelToChannelDemo {
    @Test
    public void test() throws IOException {
        String srcFile = "E:\\工作\\图片\\2022-12\\jwt-token.png";
        String toFile = "E:\\工作\\图片\\2022-12\\jwt-token-4.png";
        // 通过open()方法来获得通道
        FileChannel inChannel = FileChannel.open(Paths.get(srcFile), StandardOpenOption.READ);

        // outChannel需要为 READ WRITE CREATE模式
        // READ WRITE是因为后面获取直接缓冲区时模式为READ_WRITE模式
        // CREATE是因为要创建新的文件
        FileChannel outChannel = FileChannel.open(Paths.get(toFile), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // 通道间直接传输
        inChannel.transferTo(0, inChannel.size(), outChannel);
        // 对应的还有transferFrom
        // outChannel.transferFrom(inChannel, 0, inChannel.size());

        inChannel.close();
        outChannel.close();
    }
}
