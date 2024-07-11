package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isDivisibleBy400() {
      LeapYears leapYears = new LeapYears();

      assertThat(String.valueOf(leapYears.isLeapYear(400)), true);
  }

}


