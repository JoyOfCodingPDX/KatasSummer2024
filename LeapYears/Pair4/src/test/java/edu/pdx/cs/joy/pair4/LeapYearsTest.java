package edu.pdx.cs.joy.pair4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  LeapYears year = new LeapYears();
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void testYearMultipleOf400IsLeapYear()
  {
    boolean result = year.isLeapYear(400);

    assertEquals(result, true);
  }

  @Test
  void testYearMultipleOf100ButNot400IsNotLeapYear()
  {
    boolean result = year.isLeapYear(500);

    assertEquals(result, false);
  }

  @Test
  void testYearMultipleOf4ButNot100IsLeapYear() {
    boolean result = year.isLeapYear(2008);

    assertEquals(result, false);
  }
}
