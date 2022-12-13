package server_client;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 14:53
 */

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @author liujinkun
 * @Title: NettyServer
 * @Description: Netty服务端
 * @date 2019/11/24 2:56 PM
 */
public class NettyServer {

    public static void main(String[] args) {
        // 1.负责处理连接的线程组
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
        // 2.负责处理IO和业务逻辑的线程组
        NioEventLoopGroup workerGroup = new NioEventLoopGroup(8);
        try {
            // 3.创建服务端启动助手
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            // 4.设置线程组
            serverBootstrap.group(bossGroup, workerGroup)
                    // 5.设置服务端通道实现;
                    .channel(NioServerSocketChannel.class)
                    // 6.参数设置-设置线程队列中等待连接个数
                    .option(ChannelOption.SO_BACKLOG,128)
                    // 7.参数设置-设置活跃状态,child是设置workerGroup
                    .childOption(ChannelOption.SO_KEEPALIVE,true)
                    // 8.添加日志打印，用来观察Netty的启动日志
                    .handler(new LoggingHandler(LogLevel.INFO))
                    // 添加用来处理客户端channel的处理器handler
                    //一般而言只需要在这里添加自己的业务代码,----------------------------
                    //这里决定使用nio<NioSocketChannel>还是io<SocketChannel>
                    .childHandler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                            //9.向pipeline中添加自定义业务处理handler
                            ChannelPipeline pipeline = nioSocketChannel.pipeline();
                                    // 添加字符串解码器
                            pipeline.addLast(new StringDecoder())
                                    // 自定义的handler，用来打印接收到的消息
                                    .addLast(new SimpleChannelInboundHandler<String>() {
                                        @Override
                                        protected void channelRead0(ChannelHandlerContext channelHandlerContext, String message) throws Exception {
                                            System.out.println(message);
                                        }

                                        @Override
                                        public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
                                            super.channelRegistered(ctx);
                                            System.out.println("有新客户端连接");
                                        }
                                    });
                        }
                    });
            //10.启动服务端并绑定端口,同时将异步改为同步
            ChannelFuture channelFuture = serverBootstrap.bind(8080).sync();
            //11.关闭通道(并不是真正意义上的关闭,而是监听通道关闭状态)和关闭连接池
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // 关闭线程组
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}

