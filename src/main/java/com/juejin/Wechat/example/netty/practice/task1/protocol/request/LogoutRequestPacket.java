package com.juejin.Wechat.example.netty.practice.task1.protocol.request;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.LOGOUT_REQUEST;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
public class LogoutRequestPacket extends Packet{


    @Override
    public Byte getCommand() {
        return LOGOUT_REQUEST;
    }
}
