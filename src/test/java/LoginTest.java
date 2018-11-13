import com.juejin.Wechat.example.netty.protocol.PacketCodeC;
import com.juejin.Wechat.example.netty.protocol.command.LoginRequestPacket;
import com.juejin.Wechat.example.netty.protocol.command.Packet;
import com.juejin.Wechat.example.netty.serialize.Serializer;
import com.juejin.Wechat.example.netty.serialize.impl.JSONSerializer;
import io.netty.buffer.ByteBuf;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author hedongyang
 * @Description
 * @Date 2018/11/2
 **/
public class LoginTest {

    @Test
    public void dotest() {

        Serializer serializer = new JSONSerializer();
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
//
//        loginRequestPacket.setVersion(((byte) 1));
//        loginRequestPacket.setUserId(123);
//        loginRequestPacket.setUsername("zhangsan");
//        loginRequestPacket.setPassword("password");
//
//        PacketCodeC packetCodeC = new PacketCodeC();
//        ByteBuf byteBuf = packetCodeC.encode(loginRequestPacket);
//        Packet decodedPacket = packetCodeC.decode(byteBuf);
//
//        Assert.assertArrayEquals(serializer.serialize(loginRequestPacket), serializer.serialize(decodedPacket));
    }
}
