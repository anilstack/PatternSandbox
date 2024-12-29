package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.Logger;
import com.patternsandbox.anilstack.structural.helper.impl.Log4j;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class Log4jAdapter implements Logger {

    private Log4j logger;

    public Log4jAdapter() {
        this.logger = new Log4j();
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
