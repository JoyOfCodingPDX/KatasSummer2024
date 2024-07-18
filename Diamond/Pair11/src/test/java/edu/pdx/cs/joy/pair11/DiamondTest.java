package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{
  private final Diamond diamond = new Diamond();

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void distanceFromDCalculationTest() {
    int expected = 3;
    int actual = diamond.getDistanceFromA('D');
    assertEquals(expected, actual);
  }

  @Test
  void printOneLineTest() {
    String expected = "   A";
    String actual = diamond.buildLine(3, 'A');
    assertEquals(expected, actual);
  }

  @Test
  void printBLineTest() {
    String expected = "  B B";
    String actual = diamond.buildLine(2, 'B');
    assertEquals(expected, actual);
  }

}
