package receive;

import org.smartboot.socket.MessageProcessor;
import org.smartboot.socket.Protocol;
import org.smartboot.socket.transport.AioQuickServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * testmaven
 *
 * @author lx
 * @version V1.0
 * @date 2019/12/11
 * @email vinicolor.violet.end@gmail.com
 * Description:
 */
@Component
public class StructureAioQuickServer {

    @Autowired
    private MessageProcessor messageProcessor;

    @Autowired
    private Protocol protocol;

    private AioQuickServer aioQuickServer;

//    @PostConstruct
//    public void init() {
//        aioQuickServer = new AioQuickServer(8080, protocol, messageProcessor);
//        try {
//            aioQuickServer.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @PreDestroy
//    public void destroy() {
//        aioQuickServer.shutdown();
//    }
}
