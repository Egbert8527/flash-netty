package com.juejin.Wechat.example.netty.practice.task1.protocol;

import com.juejin.Wechat.example.netty.practice.task1.protocol.request.CreateGroupRequestPacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.request.LoginRequestPacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.request.LogoutRequestPacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.request.MessageRequestPacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.response.CreateGroupResponsePacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.response.LoginResponsePacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.response.LogoutResponsePacket;
import com.juejin.Wechat.example.netty.practice.task1.protocol.response.MessageResponsePacket;

import java.util.HashMap;
import java.util.Map;

import static com.juejin.Wechat.example.netty.practice.task1.protocol.command.Command.*;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
public class PacketCodec {

    public final static int MAGIC_NUMBER=0x12345678;
    public final static PacketCodec INSTANCE = new PacketCodec();

    private final Map<Byte,Class<? extends Packet>> packetTypeMap;

    private PacketCodec(){
        packetTypeMap = new HashMap<>();
        packetTypeMap.put(LOGIN_REQUEST, LoginRequestPacket.class);
        packetTypeMap.put(LOGIN_RESPONSE, LoginResponsePacket.class);
        packetTypeMap.put(LOGOUT_REQUEST, LogoutRequestPacket.class);
        packetTypeMap.put(LOGOUT_RESPONSE,LogoutResponsePacket.class);
        packetTypeMap.put(MESSAGE_REQUEST, MessageRequestPacket.class);
        packetTypeMap.put(MESSAGE_RESPONSE, MessageResponsePacket.class);
        packetTypeMap.put(CREATE_GROUP_REQUEST, CreateGroupRequestPacket.class);
        packetTypeMap.put(CREATE_GROUP_RESPONSE, CreateGroupResponsePacket.class);

    }

}
