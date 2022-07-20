package org.cicdqa.mservice.a.utils;

public class MessageUtil {

    private MessageUtil() {}

    public static String getHomeMessage(String serviceName) {
        return  "*** Micro-Service " + serviceName + " !!! ***";
    }
}
