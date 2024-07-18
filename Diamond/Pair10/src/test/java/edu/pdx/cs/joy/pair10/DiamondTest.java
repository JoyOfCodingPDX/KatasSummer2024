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

  /*@Test
  void letterACreatesCorrectArray() {
    Character c = 'a';
    String[][] result = makeDiamond(c);
    assertThat(result.length, equalTo(1));
    assertThat(result[0][0], equalTo('A'));
  }*/

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
    assertEquals(chararray[0].length,5);

  }
}
