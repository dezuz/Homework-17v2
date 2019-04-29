package com.mateacademy.bean;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("LyricistBean1")
public class Poushkin implements Lyricist {
    private static final Logger LOGGER = Logger.getLogger(Poushkin.class);
    private static final String GENERATION_MESSAGE = "I am Poushkin, the writer";

    @Override
    public String generate() {
        return GENERATION_MESSAGE;
    }

    @PostConstruct
    private void init() {
        LOGGER.info("Poushkin is initialized");
    }

    @PreDestroy
    private void preDestroy() {
        LOGGER.info("Poushkin is destroyed");
    }
}
