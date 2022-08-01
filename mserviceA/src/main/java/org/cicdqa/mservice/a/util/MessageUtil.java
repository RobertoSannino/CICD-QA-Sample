package org.cicdqa.mservice.a.util;

public class MessageUtil {

    private MessageUtil() {}

    public static String getHomeMessage(String serviceName) {
        return  "*** UPDATED: Micro-Service " + serviceName + " !!! ***";
    }
}
