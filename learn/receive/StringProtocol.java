package receive;

import org.smartboot.socket.Protocol;
import org.smartboot.socket.transport.AioSession;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;

/**
 * testmaven
 *
 * @author lx
 * @version V1.0
 * @date 2019/12/11
 * @email vinicolor.violet.end@gmail.com
 * Description:
 */
@Component("protocol")
public class StringProtocol implements Protocol<String> {

    @Override
    public String decode(ByteBuffer readBuffer, AioSession<String> session) {
        int remaining = readBuffer.remaining();
        if (remaining < Integer.BYTES) {
            return null;
        }
        readBuffer.mark();
        int length = readBuffer.getInt();
        if (length > readBuffer.remaining()) {
            readBuffer.reset();
            return null;
        }
        byte[] b = new byte[length];
        readBuffer.get(b);
        readBuffer.mark();
        return new String(b);
    }
}
