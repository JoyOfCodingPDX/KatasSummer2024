package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{
  public static Diamond canInstantiateKataClass() {
    return new Diamond();
  }

  @Test
  public static void testThatAEqualsA() {
    Diamond diamond = canInstantiateKataClass();
    assertThat(diamond.createDiamond("A"), equalTo(String("A")));
  }

  @Test
  public static void testThatBEqualsB() {
    Diamond diamond = canInstantiateKataClass();
    assertThat(diamond.createDiamond("B"), equalTo(String("A\nB B\nA")));
  }

}
