package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {
    HashTable table;

    @Before
    public void setup() {
        table = new HashTable();
    }

    @Test
    public void verifyPut() {
        table.put("John Smith", "521-1234");
        table.put("Lisa Smith", "521-8976");
        table.put("Sam Doe","521-5030");
        table.put("Sandra Dee","521-9655");
        table.put("Ted Baker","418-4165");

        System.out.println("-------------------------------");

        Assert.assertEquals("521-1234", table.get("John Smith"));
        Assert.assertEquals("521-8976", table.get("Lisa Smith"));
       Assert.assertEquals("521-5030", table.get("Sam Doe"));
        Assert.assertEquals("521-9655", table.get("Sandra Dee"));
        Assert.assertEquals("418-4165", table.get("Ted Baker"));
    }
}
