package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test how to build far jar and how to configure logger
 */
public class LogTest {
    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args){
        logger.info("Hello world");
        logger.error("ERROR");
        logger.debug("debug....");
        System.out.println(LogTest.class);
    }
}