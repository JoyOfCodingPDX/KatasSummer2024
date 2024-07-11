package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import static java.lang.Integer.parseInt;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }

    LeapYears leapYears = new LeapYears();
    int year = parseInt(args[0]);

    if (leapYears.isLeapYear(year)) {

    }
  }

  public boolean isLeapYear(int year)
  {

    if( (year % 400) == 0){
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    if(year % 4 == 0){
      return true;
    }
    return false;
  }
}