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
        table.put("car", "toyota");
        table.put("game", "mechwarrior");
        table.put("color","green");

        Assert.assertEquals("toyota", table.get("car"));
        Assert.assertEquals("mechwarrior", table.get("game"));
       Assert.assertEquals("green", table.get("color"));
    }
}
