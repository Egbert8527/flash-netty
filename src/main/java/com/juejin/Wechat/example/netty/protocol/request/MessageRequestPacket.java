package com.juejin.Wechat.example.netty.protocol.request;

import com.juejin.Wechat.example.netty.protocol.command.Packet;
import lombok.Data;

import static com.juejin.Wechat.example.netty.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/2
 **/
@Data
public class MessageRequestPacket extends Packet{
    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
