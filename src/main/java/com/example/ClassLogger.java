package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class ClassLogger {
    private static final Logger logToFile = LoggerFactory.getLogger(ClassLogger.class);

    public static void main(String[] args) {
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        logToFile.info("IP address: " + ip);

        Date date = new Date();
        logToFile.info("Date: " + date);
    }
}
