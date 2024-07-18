package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void letterACreatesCorrectArray() {
    Diamond d = new Diamond();
    char c = 'C';
    char[][] result = d.makeDiamond(c);
    assertEquals(result[0][2], 'A');
    assertEquals(result[1][1], 'B');
    assertEquals(result[1][3], 'B');
    assertEquals(result[2][0], 'C');
    assertEquals(result[2][4], 'C');
  }

  @Test
  void getDistanceSuccess(){
    Diamond d = new Diamond();
    char letter = 'C';
    int result = d.getDistance(letter);
    assertEquals(result, 2);
  }

  @Test
  void init2DArraySuccess(){
    Diamond d = new Diamond();
    char[][] chararray = d.init2DArray(2);
    assertEquals(chararray[0].length, 5);
    assertEquals(chararray.length, 3);
  }
}
