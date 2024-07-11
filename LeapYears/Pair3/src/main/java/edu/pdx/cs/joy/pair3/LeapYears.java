package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  public boolean isLeapYear(int year) {

    if (year%400 == 0) return true;
    if (year % 100 != 0 && year % 4 == 0) return true;


    else return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    LeapYears leap_year = new LeapYears();
    // System.err.println("Missing command line arguments");
    if (args.length < 1) {
      System.err.println("Missing command line arguments");
      return;
    }

    int year = Integer.parseInt(args[0]);
    System.out.println(leap_year.isLeapYear(year));
  }
}