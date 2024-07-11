package edu.pdx.cs.joy.pair3;

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
  void threeIsNotALeapYear () {
    LeapYears leap_year = new LeapYears();

    assertThat(leap_year.isLeapYear(3), equalTo(false));
  }

}
