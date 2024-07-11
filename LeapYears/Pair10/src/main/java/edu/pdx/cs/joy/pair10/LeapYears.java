package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  public static boolean isLeapYear(int year) {

    if (year % 400 == 0) {
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.out.print(args[0]);
    System.err.println("Missing command line arguments");

  }

}