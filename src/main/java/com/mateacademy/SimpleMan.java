package com.mateacademy;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("LyricistBean2")
@Scope("prototype")
public class SimpleMan implements Lyricist {
    private static final Logger LOGGER = Logger.getLogger(SimpleMan.class);
    private static final String GENERATION_MESSAGE = "I am simple man";

    @Override
    public String generate() {
        return GENERATION_MESSAGE;
    }

    @PostConstruct
    private void init() {
        LOGGER.info("Simple man is initialized");
    }

    @PreDestroy
    private void preDestroy() {
        LOGGER.info("Simple man is destroyed");
    }
}
