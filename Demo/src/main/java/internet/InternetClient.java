package internet;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 10:29
 */
// 测试
public class InternetClient {
    @Test
    public void Client() throws IOException {
        //    1.连接服务器ip,端口号.如果连接成功返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端Socket对象的运行类型是: " + socket.getClass());

        //    2.通过socket建立数据输出通道
        //    3.向数据通道中写入数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());

        //关闭流和socket对象
        outputStream.close();
        socket.close();
        System.out.println("客户端推出...");
    }
}
