package ion;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/12 17:20
 */
public class blockCommunicationDemo {
    public static void main(String[] args) throws IOException {
        Thread thread1 = new Thread(()->{
            try {
                server();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(()->{
            try {
                client();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void client() throws IOException {
        // 创建客户端通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 2022));

        // 读取信息
        String srcFile = "E:\\工作\\图片\\2022-12\\jwt-token.png";
        FileChannel fileChannel = FileChannel.open(Paths.get(srcFile), StandardOpenOption.READ);

        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        // 写入数据
        while (fileChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            byteBuffer.clear();
        }

        fileChannel.close();
        socketChannel.close();
    }

    public static void server() throws IOException {
        // 创建服务端通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        String toFile = "E:\\工作\\图片\\2022-12\\jwt-token-4.png";
        FileChannel fileChannel = FileChannel.open(Paths.get(toFile), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // 绑定链接
        serverSocketChannel.bind(new InetSocketAddress(2022));

        // 获取客户端的通道
        SocketChannel socketChannel = serverSocketChannel.accept();

        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (socketChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }

        socketChannel.close();
        fileChannel.close();
        serverSocketChannel.close();
    }
}
