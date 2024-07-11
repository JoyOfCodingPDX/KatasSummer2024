package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void checkValidYear() {
    LeapYears leapYear = new LeapYears();
  }

  @Test
  void divisibleBy400() {
    LeapYears leapYear = new LeapYears();
    assertTrue(LeapYears.leapYear(400));
  }

  @Test
  void divisibleBy100ButNot400() {
    LeapYears leapYear = new LeapYears();
    assertFalse(LeapYears.leapYear(1700));
  }

  @Test
  void divisbleBy4ButNot100() {
    LeapYears leapYear = new LeapYears();
    assertTrue(LeapYears.leapYear(2008));
  }

  @Test
  void notDivisbleBy4() {
    LeapYears leapYear = new LeapYears();
    assertFalse(LeapYears.leapYear(2017));
  }

  @Test
  void invalidYear() {
    String year[] = {"year"};
    assertThrows(Exception.class, () -> {
      LeapYears leapYear = new LeapYears();
      leapYear.main(year);
    });
  }
}
