package com.juejin.Wechat.example.netty.practice.task1.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/13
 **/
@Data
public abstract class Packet {
    @JSONField(deserialize = false,serialize = false)
    private Byte version = 1;

    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
