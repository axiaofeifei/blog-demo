package internet;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 11:24
 */
public class InternetClient_2 {

    @Test
    public void Client2() throws IOException, InterruptedException {
        byte[] buf = new byte[1024];
        int readLen = 0;
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        outputStream.write("hello server".getBytes());
        //socket关闭输出流
        socket.shutdownOutput();


        System.out.println("客户器端收到的消息...");
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
