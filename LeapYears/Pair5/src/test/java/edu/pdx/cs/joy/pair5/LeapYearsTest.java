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
    boolean isLeap = leapYears.isLeapYear(2000);
    assert (isLeap);
  }

  @Test
  void isLeapYearFor100Not400(){
    LeapYears leapYears = new LeapYears();
    boolean isLeap = leapYears.isLeapYear(1700);
    assert (isLeap);
  }

  @Test
  void isLeapYearFor4Not100(){
    LeapYears leapYears = new LeapYears();
    boolean isLeap = leapYears.isLeapYear(2008);
    assert (isLeap);
  }

  @Test
  void isLeapYearFor4(){
    LeapYears leapYears = new LeapYears();
    boolean isLeap = leapYears.isLeapYear(2020);
    assert (isLeap);
  }



}
