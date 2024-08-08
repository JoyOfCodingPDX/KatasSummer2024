package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

public class BoardClassTest {

    @Test
    void testBoard() {
        char [][] input = {
                {'*', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '*', '0', '0'},
                {'0', '0', '0', '0'},
        };
        char [][] expected = {
                {'*', '1', '0', '0'},
                {'2', '2', '1', '0'},
                {'1', '*', '1', '0'},
                {'1', '1', '1', '0'},
        };
        BoardClass bc = new BoardClass(input);
        assertThat(bc.incrementBoard(), equals(expected));
    }

    @Test
    void updateTest() {

    }
}
