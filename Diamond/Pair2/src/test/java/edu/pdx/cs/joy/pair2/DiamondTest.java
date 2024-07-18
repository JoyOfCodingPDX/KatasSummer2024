package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

    @Test
    void canInstantiateKataClass() {
        new Diamond();
    }

    @Test
    void testALine() {
        Diamond diamond = new Diamond();
        assertEquals(diamond.getRow('A', 'C'), "  A  ");
    }

    @Test
    void testBLine() {
        Diamond diamond = new Diamond();
        assertEquals(diamond.getRow('B', 'C'), " B B ");
    }

    @Test
    void testCLine() {
        Diamond diamond = new Diamond();
        assertEquals(diamond.getRow('C', 'C'), "C   C");
    }
}
