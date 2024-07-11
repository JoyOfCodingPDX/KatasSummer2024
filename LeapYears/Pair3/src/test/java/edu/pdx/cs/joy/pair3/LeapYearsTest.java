package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest {

  private final LeapYears leap_year = new LeapYears();

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void threeIsNotALeapYear() {
    assertThat(leap_year.isLeapYear(3), equalTo(false));
  }

  @Test
  void fourhundredIsALeapYear() {
    assertThat(leap_year.isLeapYear(400), equalTo(true));
  }

  @Test
  void hundredIsNotALeapYear() {
    assertThat(leap_year.isLeapYear(100), equalTo(false));
  }

  @Test
  void fiveHundredIsNotALeapYear() {
    assertThat(leap_year.isLeapYear(500), equalTo(false));
  }

  @Test
  void twentyIsALeapYear() {
    assertThat(leap_year.isLeapYear(20), equalTo(true));
  }

}