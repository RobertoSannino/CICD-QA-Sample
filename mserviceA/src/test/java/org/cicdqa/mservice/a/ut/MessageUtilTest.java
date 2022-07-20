package org.cicdqa.mservice.a.ut;

import org.cicdqa.mservice.a.utils.MessageUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageUtilTest {

    private static final String SERVICE_NAME = "SERVICE_NAME";

    @Test
    void testHomeMessage() {
        Assertions.assertEquals(
            "*** Micro-Service SERVICE_NAME !!! ***",
            MessageUtil.getHomeMessage(SERVICE_NAME)
        );
    }

}
