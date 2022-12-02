package internet;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/2 13:46
 */
/**
 * 应用案例3(使用字符流
 * 1.编写一个服务端,和一个客户端
 * 2.服务端在 9999端口监听
 * 3.客户端连接到服务端，发送“hello, server”并接收服务端回发的”hello,client”，再退
 * 出
 * 4.服务端接收到 客户端发送的 信息，输出，并发送“hello,client”再退出
 */
public class InternetServer_3 {

    @Test
    public void Server_3() throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(9999);
        String readLen = "";
        System.out.println("等待客户端联接...");
        Socket accept = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

        //接收信息
        System.out.println("服务器端接收到的消息...");
        Thread.sleep(5000);
        while ((readLen = bufferedReader.readLine()) != null) {
            System.out.println(readLen);
        }
        accept.shutdownInput();

        bufferedWriter.write("hello client");
        //字符流必须刷新
        bufferedWriter.flush();
        //必须放在flush()后面关闭
        accept.shutdownOutput();

        bufferedReader.close();
        bufferedWriter.close();


        accept.close();
        serverSocket.close();
        System.out.println("服务器端退出...");

    }
}
