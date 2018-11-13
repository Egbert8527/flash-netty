package com.juejin.Wechat.example.netty.practice.task1.protocol.request;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;
import lombok.Data;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.LOGIN_REQUEST;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
@Data
public class LoginRequestPacket extends Packet{
    private Integer userId;
    private String password;
    private String username;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
