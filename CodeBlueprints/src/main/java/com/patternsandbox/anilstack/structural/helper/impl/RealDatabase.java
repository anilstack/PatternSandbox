package com.patternsandbox.anilstack.structural.helper.impl;

import com.patternsandbox.anilstack.structural.helper.Database;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing query on real database: "+sql);
    }
}
