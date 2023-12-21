package spring.advanced.proxy.pureproxy.concreteproxy;

import org.junit.jupiter.api.Test;
import spring.advanced.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import spring.advanced.proxy.pureproxy.concreteproxy.code.ConcreteLogic;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }
}