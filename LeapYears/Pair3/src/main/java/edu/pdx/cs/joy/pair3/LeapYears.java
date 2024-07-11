package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  public boolean isLeapYear(int year) {
    if (year%400 == 0) return true;
    if (year % 4 == 0) return true;

    else return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}