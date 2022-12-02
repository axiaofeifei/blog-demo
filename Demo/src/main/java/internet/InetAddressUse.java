package internet;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/30 10:05
 */
// remote 测试测试

//测试测试
public class InetAddressUse {
    public static void main(String[] args) {

    }

    @Test
    public void test() throws UnknownHostException {
        /**
         * 1. 获取本机InetAddress对象，getLocalHost
         * 2. 根据指定主机名、域名获取ip地址对象，getByName
         * 3. 获取InetAddress对象的主机名 getHostName
         * 4. 获取InetAddress对象的地址 getHostAddress
         */
        InetAddress localHost = InetAddress.getLocalHost();
        // 获取 计算机名+本机的ip  LAPTOP-1IRM7I70/172.16.74.28
        System.out.println(localHost);


        InetAddress byName = InetAddress.getByName("LAPTOP-1IRM7I70");
        //InetAddress byName = InetAddress.getByName("172.16.74.28");
        // 根据机器名称获取InetAddress对象
        System.out.println(byName);

        // 根据域名获取到InetAddress对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu);

        // 通过InetAddress对象，获取主机地址
        String ipHost = baidu.getHostAddress();
        String localHostIp = localHost.getHostAddress();
        System.out.println("ipHost 对应的主机地址是；" + ipHost);
        System.out.println("localhost 对应的主机地址是；" + localHostIp);

        // 通过InetAddress对象，获取主机名/域名
        String nameHost = baidu.getHostName();
        System.out.println("ipHost 对应的主机域名是；" + nameHost);

        String name = localHost.getHostName();
        System.out.println("localHost对应的主机名是:" + name);

    }


}
