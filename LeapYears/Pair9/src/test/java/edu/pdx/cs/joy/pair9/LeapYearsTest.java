package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void leapYearHasDefaultVariable() {
    LeapYears testLeapYears =  new LeapYears();
    assertThat(testLeapYears.getYear(), equalTo(0) );
  }

  @Test
  void leapYearIsAnInteger() {
    LeapYears testLeapYears =  new LeapYears();
    assertThat(testLeapYears.getYear() getClass(), equalTo(int.class));
  }

}
