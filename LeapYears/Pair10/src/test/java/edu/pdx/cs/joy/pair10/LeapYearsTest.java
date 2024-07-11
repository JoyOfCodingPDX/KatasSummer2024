package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void year2000IsLeapYear() {
    assertEquals(true, LeapYears.isLeapYear(2000));
  }

  @Test
  void year2100IsLeapYear() {
    assertEquals(false, LeapYears.isLeapYear(2100));
  }

}
