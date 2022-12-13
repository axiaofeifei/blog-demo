package server_client;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.boot.logging.LogLevel;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/13 14:53
 */

/**
 * @author liujinkun
 * @Title: NettyClient
 * @Description: Netty客户端
 * @date 2019/11/24 2:57 PM
 */
public class NettyClient {

    private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        // 客户端只需要一个线程组即可
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup();
        try {
            // 采用Bootstrap而不是ServerBootstrap
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(nioEventLoopGroup)
                    // 设置客户端的SocketChannel
                    .channel(NioSocketChannel.class)
                    //一般而言，只需要在这里添加业务代码------------------------------------
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                            ChannelPipeline pipeline = nioSocketChannel.pipeline();
                            // 添加一个字符串编码器
                            pipeline.addLast(new StringEncoder());
                        }
                    });
            //配置端口
            ChannelFuture channelFuture = bootstrap.connect("", 8080).sync();

            Channel channel = channelFuture.channel();

            executorService.scheduleAtFixedRate(()->{
                String message = channel.localAddress().toString() + " Hello World";
                channel.writeAndFlush(message);
            },0,3, TimeUnit.SECONDS);

            channel.closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            nioEventLoopGroup.shutdownGracefully();
        }

    }
}
