package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void leapYearHasDefaultVariable() {
    LeapYears testLeapYears =  new LeapYears(0);
    assertThat(testLeapYears.getYear(), equalTo(0) );
  }

//  @Test
//  void leapYearIsAnInteger() {
//    LeapYears testLeapYears =  new LeapYears();
//    assertThat(testLeapYears.getYear().getClass(), equalTo(int.class));
//  }

  @Test
  void yearCanBeDividedBy400() {
    LeapYears testLeapYears =  new LeapYears(400);
    assertThat(testLeapYears.isLeapYear() , equalTo(true));
  }

  @Test
  void yearCannotBeDividedBy399() {
    LeapYears testLeapYears =  new LeapYears(399);
    assertThat(testLeapYears.isLeapYear() , equalTo(false));
  }

  @Test
  void leapYearCannotBeDividedBy100() {
    LeapYears testLeapYears =  new LeapYears(100);
    assertThat(testLeapYears.isLeapYear() , equalTo(false));
  }

  @Test
  void leapYearCanBeDividedBy4() {
    LeapYears testLeapYears =  new LeapYears(4);
    assertThat(testLeapYears.isLeapYear() , equalTo(true));
  }

  @Test
  void leapYearCannotBeDividedBy2017() {
    LeapYears testLeapYears =  new LeapYears(2017);
    assertThat(testLeapYears.isLeapYear() , equalTo(false));
  }

}
