package org.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree bst;

    @Before
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void verifyInsert() {
        bst.insert(5,"e");
        bst.insert(3,"c");
        bst.insert(2,"b");
        bst.insert(4,"d");
        bst.insert(7,"g");
        bst.insert(6,"f");
        bst.insert(8,"h");

        Assert.assertEquals("e", bst.find(5));
        Assert.assertEquals("c", bst.find(3));
        Assert.assertEquals("b", bst.find(2));
        Assert.assertEquals("d", bst.find(4));
        Assert.assertEquals("g", bst.find(7));
        Assert.assertEquals("f", bst.find(6));
        Assert.assertEquals("h", bst.find(8));
        Assert.assertEquals(null, bst.find(99));

//        bst.prettyPrint();
    }

    @Test
    public void verifyMin() {
        bst.insert(5,"e");
        bst.insert(3,"c");
        bst.insert(2,"b");
        bst.insert(4,"d");
        bst.insert(7,"g");
        bst.insert(6,"f");
        bst.insert(8,"h");

        Assert.assertEquals("b", bst.getMin(bst.root));
    }

    @Test
    public void deleteNoChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");
    }

    @Test
    public void deleteOneChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");
    }

    @Test
    public void deleteTwoChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");
    }

}
