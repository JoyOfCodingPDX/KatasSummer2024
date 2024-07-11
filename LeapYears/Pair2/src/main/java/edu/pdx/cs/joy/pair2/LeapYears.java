package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    }
      return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }


}