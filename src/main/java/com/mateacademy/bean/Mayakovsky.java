package com.mateacademy.bean;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("LyricistBean3")
public class Mayakovsky implements Lyricist {
    private static final Logger LOGGER = Logger.getLogger(Mayakovsky.class);
    private static final String GENERATION_MESSAGE = "I am Mayakovsky, the writer";

    @Override
    public String generate() {
        return GENERATION_MESSAGE;
    }

    @PostConstruct
    private void init() {
        LOGGER.info("Mayakovsky is initialized");
    }

    @PreDestroy
    private void preDestroy() {
        LOGGER.info("Mayakovsky is destroyed");
    }
}
