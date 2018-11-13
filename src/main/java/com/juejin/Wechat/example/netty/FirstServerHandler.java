package com.juejin.Wechat.example.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/2
 **/
public class FirstServerHandler extends ChannelInboundHandlerAdapter{

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;

        System.out.println(new Date() + ": 服务端读到数据 -> " + byteBuf.toString(Charset.forName("utf-8")));


        System.out.println(new Date() + ": 服务端写出数据");
        ByteBuf out = getByteBuf(ctx);
        ctx.channel().writeAndFlush(out);


    }


    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        byte[] bytes = "你好，欢迎关注掘金小册".getBytes(Charset.forName("utf-8"));

        ByteBuf buffer = ctx.alloc().buffer();

        buffer.writeBytes(bytes);

        return buffer;
    }

    /**
     * @Author hedongyang
     * @Description
     * @Date 2018/9/30
     **/
    public static class NettyServer {
        public static void main(String[] args) {
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            NioEventLoopGroup boss = new NioEventLoopGroup();
            NioEventLoopGroup worker = new NioEventLoopGroup();

            serverBootstrap
                    .group(boss, worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<NioSocketChannel>() {
                        protected void initChannel(NioSocketChannel ch) {
                            ch.pipeline().addLast(new FirstServerHandler());
                        }
                    }).childOption(ChannelOption.SO_KEEPALIVE,true);

            bind(serverBootstrap,1111);

    //                .bind(8000).addListener(new GenericFutureListener<Future<? super Void>>() {
    //            @Override
    //            public void operationComplete(Future<? super Void> future) throws Exception {
    //                if (future.isSuccess()) {
    //                    System.out.println("端口绑定成功!");
    //                } else {
    //                    System.err.println("端口绑定失败!");
    //                }
    //            }
    //        });
        }

        private static void bind(final ServerBootstrap serverBootstrap, final int port) {
            serverBootstrap.bind(port).addListener(new GenericFutureListener<Future<? super Void>>() {
                public void operationComplete(Future<? super Void> future) {
                    if (future.isSuccess()) {
                        System.out.println("端口[" + port + "]绑定成功!");
                    } else {
                        System.err.println("端口[" + port + "]绑定失败!");

                        bind(serverBootstrap, port + 1);
                    }
                }
            });
        }

    }
}
