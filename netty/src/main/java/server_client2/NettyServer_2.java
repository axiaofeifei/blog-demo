package server_client2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 15:21
 */
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Descrition :服务端的编写
 * @Date： Created in 11:00 上午 2021/11/30
 */
public class NettyServer_2 {
    public static void main(String[] args) throws InterruptedException {
        //1.创建bossGroup线程组: 处理网络事件--连接事件 线程数默认为: 2 * 处理器线程数
        EventLoopGroup bossGroup=new NioEventLoopGroup(1);
        //2.创建workerGroup线程组: 处理网络事件--读写事件 2 * 处理器线程数
        EventLoopGroup workGroup=new NioEventLoopGroup();
        //3.创建服务端启动助手
        ServerBootstrap bootstrap=new ServerBootstrap();
        //4.设置线程组
        bootstrap.group(bossGroup,workGroup)
                .channel(NioServerSocketChannel.class)//5.设置服务端通道实现;
                .option(ChannelOption.SO_BACKLOG,128)//6.参数设置-设置线程队列中等待连接个数
                .childOption(ChannelOption.SO_KEEPALIVE,true)//7.参数设置-设置活跃状态,child是设置workerGroup
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        //9.向pipeline中添加自定义业务处理handler
                        socketChannel.pipeline().addLast(new CustomNettyServerHandler());
                    }
                });
        //10.启动服务端并绑定端口,同时将异步改为同步
        ChannelFuture channelFuture=bootstrap.bind(9999).sync();
        System.out.println("服务器启动成功....");
        //11.关闭通道(并不是真正意义上的关闭,而是监听通道关闭状态)和关闭连接池
        channelFuture.channel().closeFuture().sync();
        bossGroup.shutdownGracefully();
        workGroup.shutdownGracefully();
    }
}
