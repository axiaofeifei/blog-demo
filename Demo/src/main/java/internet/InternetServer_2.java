package internet;

import jdk.internal.instrumentation.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 11:24
 */
        //1.编写一个服务器端和一个客户端
        //2.服务器端在 9999端口监听
        //3.客户端连接到服务器端，发送“hello,server”,并接收服务器端回发的"hello,client”再退出" +
        //4. 服务器端接收到 客户端发送的 信息，输出，并发送“hello,client”,再退出
public class InternetServer_2 {

    @Test
    public void Server() throws IOException, InterruptedException {
        byte[] buf = new byte[1024];
        int readLen = 0;
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接...");
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();


        Thread.sleep(5000);
        System.out.println("服务器端接受到的信息:");
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
        //socket关闭输入流
        accept.shutdownInput();
        outputStream.write("hello client".getBytes());

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();



    }
}
