package internet;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 10:30
 */
public class InternetServer {

    @Test
    public void Server() throws IOException, InterruptedException {

        // 在本机999端口监听，等待连接
        // 要求本机9999端口没有被占用
        // ServerSocket可以通过accept()返回多个Socket，可以用于并发
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端在9999端口监听，等待连接中…………");

        // 当没有客户端连接9999端口时，程序会阻塞，等待连接
        // 如果有客户端连接的话，会返回一个Socket对象
        Socket accept = serverSocket.accept();
        System.out.println("socket的运行类型:" + accept.getClass());

        Thread.sleep(3000);

        byte[] buf = new byte[1024];
        int readLen = 0;
        // 通过socket.getInputStream（）读取客户端写入数据通道的数据
        InputStream inputStream = accept.getInputStream();
        System.out.println("来自客户端的信息:");
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }

        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
