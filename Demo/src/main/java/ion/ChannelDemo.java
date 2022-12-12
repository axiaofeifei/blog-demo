package ion;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/12 14:52
 */
public class ChannelDemo {

    @Test
    public void test() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("e:\\io\\create02.txt");
        FileChannel channel1 = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("e:\\io\\create03.txt");
        FileChannel channel2 = fileOutputStream.getChannel();

        // 网络通道
        Socket socket = new Socket();
        SocketChannel channel3 = socket.getChannel();

        ServerSocket serverSocket = new ServerSocket();
        ServerSocketChannel channel4 = serverSocket.getChannel();

        DatagramSocket datagramSocket = new DatagramSocket();
        DatagramChannel channel5 = datagramSocket.getChannel();

        //关闭通道
    }
}
