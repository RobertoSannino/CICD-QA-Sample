package org.cicdqa.mservice.b.util;

public class MessageUtil {

    private MessageUtil() {}

    public static String getHelloMessage(String name) {
        return "*** Hello " + name + " !!! ***";
    }
}
