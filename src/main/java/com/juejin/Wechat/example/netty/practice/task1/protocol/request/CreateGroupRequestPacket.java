package com.juejin.Wechat.example.netty.practice.task1.protocol.request;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;

import java.util.List;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.CREATE_GROUP_REQUEST;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
public class CreateGroupRequestPacket extends Packet{

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}
