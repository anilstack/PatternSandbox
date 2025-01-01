package com.patternsandbox.anilstack.structural.helper.impl;

import com.patternsandbox.anilstack.structural.pattern.SupportHandler;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class SupervisorHandler extends SupportHandler {

    @Override
    public void handleRequest(String issue, String priority) {

        if (priority.equalsIgnoreCase("Medium")) {
            System.out.println("Supervisor handled the issue: "+issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, priority);
        }

    }
}
