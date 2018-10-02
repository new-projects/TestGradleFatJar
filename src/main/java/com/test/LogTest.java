package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test how to build far jar and how to configure logger
 */
public class LogTest {
    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args){
        //System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "DEBUG");
        logger.info("Hello world");
        logger.error("ERROR....");
        logger.debug("Debug....");
        //System.out.println(LogTest.class);
    }
}