package com.juejin.Wechat.example.netty.protocol.response;

import com.juejin.Wechat.example.netty.protocol.command.Packet;
import lombok.Data;


import static com.juejin.Wechat.example.netty.protocol.command.Command.MESSAGE_RESPONSE;


@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
