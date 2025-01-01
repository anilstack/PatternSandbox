package com.patternsandbox.anilstack.structural.helper.impl;

import com.patternsandbox.anilstack.structural.pattern.SupportHandler;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class ManagerHandler extends SupportHandler {


    @Override
    public void handleRequest(String issue, String priority) {
        if (priority.equalsIgnoreCase("high")) {
            System.out.println("Manager handled the issue: "+issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, priority);
        }
    }
}
