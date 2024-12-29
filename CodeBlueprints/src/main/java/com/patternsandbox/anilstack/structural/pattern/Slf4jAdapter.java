package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.Logger;
import com.patternsandbox.anilstack.structural.helper.impl.Slf4j;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class Slf4jAdapter implements Logger {

    private Slf4j logger;

    public Slf4jAdapter() {
        this.logger = new Slf4j();
    }

    @Override
    public void logInfo(String message) {
        logger.info(message);
    }

    @Override
    public void logError(String message) {
        logger.error(message);
    }
}
