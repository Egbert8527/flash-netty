package com.juejin.Wechat.example.netty.practice.task1.protocol.response;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;
import lombok.Data;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
@Data
public class LoginResponsePacket extends Packet{

    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
