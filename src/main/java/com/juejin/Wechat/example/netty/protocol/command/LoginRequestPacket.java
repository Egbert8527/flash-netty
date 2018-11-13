package com.juejin.Wechat.example.netty.protocol.command;

import lombok.Data;

import static com.juejin.Wechat.example.netty.protocol.command.Command.LOGIN_REQUEST;


@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
