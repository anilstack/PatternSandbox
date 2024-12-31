package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.Database;
import com.patternsandbox.anilstack.structural.helper.impl.RealDatabase;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 *
 * Whenever you want to add additionally functionality to class we can go for proxy pattern.
 * This is Virtual Proxy i:e on demand loading using lazy initialization we have still different types proxys
 *
 *
 */
public class DatabaseProxy implements Database {

    private RealDatabase realDatabase;
    private int connectionLimit;
    private int activeconnections;


    public DatabaseProxy(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    @Override
    public void query(String sql) {

        if (activeconnections >= connectionLimit) {
            System.out.println("Connection limit reached! Cannot Execute Query: "+sql);
            return;
        }

        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }

        activeconnections++;
        System.out.println("Using a connection. Active connections: "+activeconnections);
        realDatabase.query(sql);
        activeconnections--;
        System.out.println("Connection released. Active connections: "+activeconnections);



    }
}
