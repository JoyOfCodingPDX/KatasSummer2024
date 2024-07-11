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
}
