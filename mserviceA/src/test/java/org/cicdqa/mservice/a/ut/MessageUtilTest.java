package org.cicdqa.mservice.a.ut;

import org.cicdqa.mservice.a.util.MessageUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageUtilTest {

    private static final String SERVICE_NAME = "SERVICE_NAME";
    private static final String PERSON_NAME = "MARIO";

    @Test
    void testHomeMessage() {
        Assertions.assertEquals(
            "*** Micro-Service SERVICE_NAME !!! ***",
            MessageUtil.getHomeMessage(SERVICE_NAME)
        );
    }

    @Test
    void testHelloMessage() {
        Assertions.assertEquals(
                "Hello MARIO!",
                MessageUtil.getHelloMessage(PERSON_NAME)
        );
    }

}
