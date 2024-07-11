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

    try {
      year = Integer.parseInt(args[0]);
      if (isLeapYear()) {
        System.out.println(year+" is a leap year");
      } else {
        System.out.println(year+" is not a leap year");
      }
    }
    catch (NumberFormatException e) {
      System.err.println("Invalid year");
    }
  }

  public static int getYear() {
    return year;
  }

  public static boolean isLeapYear() {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else if (year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}