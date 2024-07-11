package edu.pdx.cs.joy.pair7;

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
  void leap_year_2000() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.leap_year(2000), equalTo(true));
  }
  @Test
  void leap_year_2005() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.leap_year(2005), equalTo(false));
  }
  @Test
  void leap_year_2020() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.leap_year(2020), equalTo(true));
  }
  @Test
  void leap_year_2025() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.leap_year(2025), equalTo(false));
  }
}
