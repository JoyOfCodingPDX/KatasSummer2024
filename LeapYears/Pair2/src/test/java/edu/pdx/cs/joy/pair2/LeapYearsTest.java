package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void divisibleBy400IsALeapYear() {
    LeapYears lp = new LeapYears();
    assertTrue(lp.isLeapYear(2000));
  }

  @Test
  void notDivisibleBy4ReturnsFalse() {
    LeapYears lp = new LeapYears();
    assertFalse(lp.isLeapYear(1));
  }

  @Test
  void divisibleBy4ButNotBy100AreLeapYears() {
    LeapYears lp = new LeapYears();
    assertTrue(lp.isLeapYear(2008));
  }

  @Test
  void divisibleBy4ButNot400IsFalse() {
    LeapYears lp = new LeapYears();
    assertFalse(lp.isLeapYear(2100));
  }

  @Test
  void divisibleBy4ButNot100IsTrue() {
    LeapYears lp = new LeapYears();
    assertTrue(lp.isLeapYear(2008));
  }

  @Test
  void divisibleBy4000IsFalse() {
    LeapYears lp = new LeapYears();
    assertFalse(lp.isLeapYear(4000));
  }
}
