package com.mateacademy.bean;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("LyricistBean4")
@Scope("prototype")
public class Postman implements Lyricist {
    private static final Logger LOGGER = Logger.getLogger(Postman.class);
    private static final String GENERATION_MESSAGE = "I am postman";

    @Override
    public String generate() {
        return GENERATION_MESSAGE;
    }

    @PostConstruct
    private void init() {
        LOGGER.info("Postman is initialized");
    }

    @PreDestroy
    private void preDestroy() {
        LOGGER.info("Postman is destroyed");
    }
}

