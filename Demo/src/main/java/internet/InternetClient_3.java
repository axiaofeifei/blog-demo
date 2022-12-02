package internet;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
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
public class InternetClient_3 {
    @Test
    public void Client_3() throws IOException, InterruptedException {
        String readLen = "";
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        bufferedWriter.write("hello,Server");
        bufferedWriter.flush();
        //必须放在flush()后面关闭!!!!!!!!!
        socket.shutdownOutput();

        System.out.println("客户端接受到的信息...");
        while ((readLen = bufferedReader.readLine()) != null) {
            System.out.println(readLen);
        }
        socket.shutdownInput();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();

        System.out.println("客户器端退出...");
    }
}
