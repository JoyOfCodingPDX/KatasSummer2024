package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Disabled;
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
    String actual = diamond.buildLine(3,0, 'A');
    assertEquals(expected, actual);
  }

  @Test
  void printBLineTest() {
    String expected = "  B B";
    String actual = diamond.buildLine(2, 1,'B');
    assertEquals(expected, actual);
  }

  @Disabled
  @Test
  void printDiamondTest(){
    String expected = "   A\n" +
                      "  B B\n" +
                      " C   C\n" +
                      "D     D\n" +
                      " C   C\n" +
                      "  B B\n" +
                      "   A\n";
    String actual = diamond.diamondString('D');
    assertEquals(expected, actual);
  }

}
