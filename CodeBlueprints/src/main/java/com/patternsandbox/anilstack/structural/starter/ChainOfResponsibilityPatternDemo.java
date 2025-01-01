package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.helper.impl.CustomerHandler;
import com.patternsandbox.anilstack.structural.helper.impl.ManagerHandler;
import com.patternsandbox.anilstack.structural.helper.impl.SupervisorHandler;
import com.patternsandbox.anilstack.structural.pattern.SupportHandler;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {

        SupportHandler customerSupport = new CustomerHandler();
        SupportHandler supervisorSupport = new SupervisorHandler();
        SupportHandler managerSupport = new ManagerHandler();

        //set up a chain
        customerSupport.setNextHandler(supervisorSupport);
        supervisorSupport.setNextHandler(managerSupport);

        customerSupport.handleRequest("Password reset", "low");
        customerSupport.handleRequest("Account locked", "medium");
        customerSupport.handleRequest("data breach","high");
        customerSupport.handleRequest("unknown issue", "critical");


    }


}
