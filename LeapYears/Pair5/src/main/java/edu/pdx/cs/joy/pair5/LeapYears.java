package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    LeapYears leapYears = new LeapYears();
    if(leapYears.isLeapYear(2000)) {
      System.out.println("Is a leap year");
    }else{
      System.out.println("Is not a leap year");
    }
    //System.err.println("Missing command line arguments");
  }

  public boolean isLeapYear(int year) {
    boolean isLeapYear = false;
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      isLeapYear = true;
    }

    if (year % 100 == 0 && year % 400 == 0) {
      isLeapYear = true;
    }

    return isLeapYear;
  }
}