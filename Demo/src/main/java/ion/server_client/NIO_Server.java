package ion.server_client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 14:44
 */
public class NIO_Server {

    public static void main(String[] args) throws IOException, IOException {
        //[1] 创建一个服务器端的通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // [2] 轮询器，不同的操作系统对应不同的实现类
        Selector selector = Selector.open();
        // [3]绑定端口
        serverSocketChannel.bind(new InetSocketAddress(8080));
        // [4] 设置为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // [5] 将服务端channel注册到轮询器上，并告诉轮询器，自己感兴趣的事件是ACCEPT事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while(true){
            // [6]调用轮询器的select()方法，是让轮询器从操作系统上获取所有的事件（例如：新客户端的接入、数据的写入、数据的写出等事件）
            selector.select(200);
            // 调用select()方法后，轮询器将查询到的事件全部放入到了selectedKeys中
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            // 遍历所有事件
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while(iterator.hasNext()){
                SelectionKey key = iterator.next();

                // 如果是新连接接入
                if(key.isAcceptable()){
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    System.out.println("有新客户端来连接");
                    socketChannel.configureBlocking(false);
                    // 有新的客户端接入后，就样将客户端对应的channel所感兴趣的时间是可读事件
                    socketChannel.register(selector,SelectionKey.OP_READ);
                }
                // 如果是可读事件
                if(key.isReadable()){
                    // 从channel中读取数据
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    channel.read(byteBuffer);
                    byteBuffer.flip();
                    System.out.println(Charset.defaultCharset().decode(byteBuffer));
                    // 读完了以后，再次将channel所感兴趣的时间设置为读事件，方便下次继续读。当如果后面要想往客户端写数据，那就注册写时间：SelectionKey.OP_WRITE
                    channel.register(selector,SelectionKey.OP_READ);
                }
                // 将SelectionKey从集合中移除，
                // [8] 这一步很重要，如果不移除，那么下次调用selectKeys()方法时，又会遍历到该SelectionKey，这就造成重复处理了，而且最终selectionKeys这个集合的大小会越来越大。
                iterator.remove();
            }


        }
    }
}
