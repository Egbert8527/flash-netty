package com.juejin.Wechat.example.netty.practice.task1.protocol.response;

import com.juejin.Wechat.example.netty.practice.task1.protocol.Packet;
import lombok.Data;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.LOGOUT_RESPONSE;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/

@Data
public class LogoutResponsePacket extends Packet{

    private boolean success;

    private String reason;



    @Override
    public Byte getCommand() {
        return LOGOUT_RESPONSE;
    }


}
