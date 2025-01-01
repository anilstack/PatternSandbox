package com.patternsandbox.anilstack.structural.pattern;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * Chain of Responsibility routes independent requests through a chain of handlers,
 * where each handler independently decides whether to process the request or pass it on.
 *
 *
 */
public abstract class SupportHandler {


    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue, String priority);


}
