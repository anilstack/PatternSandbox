package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.helper.Database;
import com.patternsandbox.anilstack.structural.pattern.DatabaseProxy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        Database database = new DatabaseProxy(2);
        database.query("SELECT * FROM USERS");
        database.query("INSERT INTO ORDERS (id, amount) VALUES (1, 100)");
        database.query("DELETE FROM PRODUCTS WHERE id=5");
    }

}
