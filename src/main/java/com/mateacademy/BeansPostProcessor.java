package com.mateacademy;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeansPostProcessor implements BeanPostProcessor {
    private static final Logger LOGGER = Logger.getLogger(BeansPostProcessor.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        if (bean != null) {
            LOGGER.info("BPP after " + bean.getClass().getSimpleName());
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        if (bean != null) {
            LOGGER.info("BPP before " + bean.getClass().getSimpleName());
        }
        return bean;
    }
}
