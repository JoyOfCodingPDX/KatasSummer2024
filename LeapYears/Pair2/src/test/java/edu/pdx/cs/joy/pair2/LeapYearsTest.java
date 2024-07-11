package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void year2000IsALeapYear() {
    LeapYears lp = new LeapYear();
    assertTrue(lp.isLeapYear(2000));
  }

  @Test
  void notDivisibleBy4ReturnsFalse() {
    LeapYears lp = new LeapYear();
    assertFalse(lp.isLeapYear(1));
  }

  @Test
  void divisibleBy4ButNotBy100AreLeapYears() {
    LeapYears lp = new LeapYear();
    assertTrue(lp.isLeapYear(2008));
  }
}
