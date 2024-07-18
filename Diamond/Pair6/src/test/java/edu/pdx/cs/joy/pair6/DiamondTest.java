package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondTest
{
  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void testThatAEqualsA() {
  Diamond diamond = new Diamond();
    assertThat(diamond.createDiamond("A"), equalTo("A"));
  }

  @Test
  void testThatBEqualsB() {
    Diamond diamond = new Diamond();
    assertThat(diamond.createDiamond("B"), equalTo("A\nB B\nA"));
  }

  @Test
  void testThatCEqualsC() {
    Diamond diamond = new Diamond();
    assertThat(diamond.createDiamond("C"), equalTo("A\nB B\nA"));
  }
}
