package com.mateacademy;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    private static final Logger LOGGER = Logger.getLogger(Start.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LyricistConfiguration.class);

        Lyricist firstLyricist = context.getBean("LyricistBean1", Lyricist.class);
        LOGGER.info(firstLyricist.generate());
        LOGGER.info(firstLyricist.hashCode());

        Lyricist secondLyricist = context.getBean("LyricistBean2", Lyricist.class);
        LOGGER.info(secondLyricist.generate());
        LOGGER.info(secondLyricist.hashCode());

        Lyricist thirdLyricist = context.getBean("LyricistBean3", Lyricist.class);
        LOGGER.info(thirdLyricist.generate());
        LOGGER.info(thirdLyricist.hashCode());

        Lyricist fourthLyricist = context.getBean("LyricistBean4", Lyricist.class);
        LOGGER.info(fourthLyricist.generate());
        LOGGER.info(fourthLyricist.hashCode());

        context.close();
    }
}
