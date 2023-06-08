package org.example;

import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application stat");
        int id = 111;
        String name = "X5";
        logger.debug("This debug message");
        logger.info("User {} has logged in using id {}", id);
    }

}