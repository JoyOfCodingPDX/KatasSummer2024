package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  private static int year;

  public LeapYears(int i) {
    year = i;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static int getYear() {
    return year;
  }
  public static boolean isLeapYear() {
    if (year % 400 == 0) {
      return true;
    }
    return false;
  }
}