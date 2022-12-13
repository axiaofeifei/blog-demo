package ion.server_client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 14:44
 */
public class NIO_Client {
    private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        boolean connect = socketChannel.connect(new InetSocketAddress("127.0.0.1", 8080));
        // 因为连接是一个异步操作，所以需要在下面一行判断连接有没有完成。如果连接还没有完成，就进行后面的操作，会出现异常
        if(!connect){
            // 如果连接未完成，就等待连接完成
            socketChannel.finishConnect();
        }
        // 每个3秒向服务端发送一条消息
        executorService.scheduleAtFixedRate(() -> {
            try {
                String message = socketChannel.getLocalAddress().toString() + " Hello World";
                // 使用ByteBuffer进行数据发送
                ByteBuffer byteBuffer = ByteBuffer.wrap(message.getBytes());
                socketChannel.write(byteBuffer);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }, 0, 3, TimeUnit.SECONDS);
    }
}
