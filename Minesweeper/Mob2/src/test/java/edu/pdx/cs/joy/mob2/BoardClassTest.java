package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BoardClassTest {

    @Disabled
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
        assertThat(bc.incrementBoard(), equalTo(expected));
    }

    @Test
    void updateTest() {

    }
}
