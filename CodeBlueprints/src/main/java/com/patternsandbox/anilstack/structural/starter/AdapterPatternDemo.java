package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.helper.Logger;
import com.patternsandbox.anilstack.structural.pattern.Log4jAdapter;
import com.patternsandbox.anilstack.structural.pattern.Slf4jAdapter;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class AdapterPatternDemo {

    private Logger logger;

    public AdapterPatternDemo(Logger logger) {
        this.logger = logger;
    }

    public void performTask() {
        logger.logInfo("Task Started");
        try {
            int result = 10/0;
        } catch (Exception e) {
            logger.logError("An Error Occurred: "+e.getMessage());
        }
        logger.logInfo("Task Finished");
    }

    public static void main(String[] args) {

        Logger log4jLogger = new Slf4jAdapter();
        AdapterPatternDemo adapterPattern = new AdapterPatternDemo(log4jLogger);
        adapterPattern.performTask();

    }


}
