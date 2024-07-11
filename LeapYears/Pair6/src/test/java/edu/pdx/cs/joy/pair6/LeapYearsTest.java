package edu.pdx.cs.joy.pair6;

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
  void leapYearCheck(){
    LeapYears leapYears = new LeapYears();
    assertThat.(leapYears.isLeapYear(2024), equalTo(true))
  }

}
