package edu.pdx.cs.joy.pair5;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isLeapYearFor400(){
    LeapYears leapYears = new LeapYears();
    Boolean isLeap = leapYears.isLeapYear(400);
    assert (isLeap);
  }

  @Test
  void isLeapYearFor100Not400(){
    LeapYears leapYears = new LeapYears();
    Boolean isLeap = leapYears.isLeapYear(100);
    assert (isLeap);
  }

  @Test
  void isLeapYearFor4Not100(){}

}
