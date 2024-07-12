package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    LeapYears lp = new LeapYears();
    assertEquals(lp.getClass(), LeapYears.class);
  }
  @Test
  void fourHundredisLeapYear() {
    assertEquals(LeapYears.fourhundred(400), true);
    assertEquals(LeapYears.fourhundred(2000), true);
    assertEquals(LeapYears.fourhundred(-400), true);
    assertEquals(LeapYears.fourhundred(401), false);
    assertEquals(LeapYears.fourhundred(1), false);
  }

  @Test
  void oneHunderIsNotLeapYear() {
    assertEquals(LeapYears.onehundred(100), false);
    assertEquals(LeapYears.onehundred(1000), false);
    assertEquals(LeapYears.onehundred(-100), false);
    assertEquals(LeapYears.onehundred(400), false);
    assertEquals(LeapYears.onehundred(1), true);
    assertEquals(LeapYears.onehundred(101), true);
  }

  @Test
  void fourIsLeapYear() {
    assertEquals(LeapYears.four(4), true);
    assertEquals(LeapYears.four(12), true);
    assertEquals(LeapYears.four(-4), true);
    assertEquals(LeapYears.four(5), false);
    assertEquals(LeapYears.four(1), false);
  }
}
