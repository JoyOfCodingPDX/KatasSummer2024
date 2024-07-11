package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean isLeapYear (int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 100 == 0 && year % 400 != 0) {
      return false;
    }
    if (year % 100 != 0 && year % 4 == 0) {
      return true;
    }
    return false;
  }
}