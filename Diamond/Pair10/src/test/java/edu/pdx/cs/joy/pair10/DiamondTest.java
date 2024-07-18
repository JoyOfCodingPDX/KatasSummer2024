package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void letterACreatesCorrectArray() {
    Character c = 'a';
    String[][] result = makeDiamond(c);
    assertThat(result.length, equalTo(1));
    assertThat(result[0][0], equalTo('A'));
  }
}
