package com.juejin.Wechat.example.netty.practice.task1.protocol.request;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;
import lombok.Data;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/

@Data
public class MessageRequestPacket extends Packet{
    private String message;


    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
