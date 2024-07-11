package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isLeapYearCheck(){
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2024), equalTo(true));
    assertThat(leapYears.isLeapYear(2008), equalTo(true));
    assertThat(leapYears.isLeapYear(1968), equalTo(true));
    assertThat(leapYears.isLeapYear(1956), equalTo(true));
  }

  @Test
  void tooEarlyCheck() {
    LeapYears leapYears = new LeapYears();

    assertThrows(IllegalArgumentException.class, () -> {
      leapYears.isLeapYear(500);
    });
  }

  @Test
  void tooEarlyTryCatchCheck() {
    try {
      leapYears.isLeapYear(500);
      fail("Expected an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertThat(e.contains("Year is out of bounds: Please put a year greater than 1581"), equals(true));
    }
  }

  @Test
  void areNotLeapYearsCheck(){
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2023), equalTo(false));
    assertThat(leapYears.isLeapYear(2005), equalTo(false));
    assertThat(leapYears.isLeapYear(2003), equalTo(false));
    assertThat(leapYears.isLeapYear(1975), equalTo(false));
  }
}
