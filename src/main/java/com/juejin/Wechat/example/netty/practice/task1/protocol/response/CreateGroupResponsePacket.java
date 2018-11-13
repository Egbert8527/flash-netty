package com.juejin.Wechat.example.netty.practice.task1.protocol.response;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
public class CreateGroupResponsePacket extends Packet{

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_RESPONSE;
    }
}
