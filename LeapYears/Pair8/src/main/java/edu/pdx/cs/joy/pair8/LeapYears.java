package edu.pdx.cs.joy.pair8;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean isLeapYear(int i) {
    if (i % 400 == 0)
      return true;
    return false;
  }
}