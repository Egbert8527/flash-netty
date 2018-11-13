package com.juejin.Wechat.example.netty.practice.task1.protocol.response;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
@Data
public class MessageResponsePacket extends Packet{

    private String fromUserId;

    private String fromUserName;

    private String message;


    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }


}
