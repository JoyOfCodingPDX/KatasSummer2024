package edu.pdx.cs.joy.pair4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void testYearMultipleOf400IsLeapYear()
  {
    LeapYears year = new LeapYears();
    boolean result = year.isLeapYear(400);

    assertEquals(result, true);
  }

}
