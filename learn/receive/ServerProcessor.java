package receive;

import org.smartboot.socket.MessageProcessor;
import org.smartboot.socket.StateMachineEnum;
import org.smartboot.socket.transport.AioSession;
import org.smartboot.socket.transport.WriteBuffer;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * testmaven
 *
 * @author lx
 * @version V1.0
 * @date 2019/12/11
 * @email vinicolor.violet.end@gmail.com
 * Description:
 */
@Component("messageProcessor")
public class ServerProcessor implements MessageProcessor<String> {

    @Override
    public void process(AioSession<String> session, String msg) {
        WriteBuffer writeBuffer = session.writeBuffer();
        byte[] bytes = msg.getBytes();

        try {
            writeBuffer.writeInt(bytes.length);
            writeBuffer.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stateEvent(AioSession<String> session, StateMachineEnum stateMachineEnum, Throwable throwable) {
    }
}
