package org.cicdqa.mservice.a.util;

public class MessageUtil {

    private MessageUtil() {}

    public static String getHomeMessage(String serviceName) {
        return  "*** Micro-Service " + serviceName + " !!! ***";
    }

    public static String getHelloMessage(String name) {
        return "Hello " + name + "!";
    }
}
