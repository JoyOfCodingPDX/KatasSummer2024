package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

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

    if (args.length > 1) {
      System.err.println("Enter only one year");
      return;
    }

    try {
      int year = Integer.parseInt(args[0]);

    }
    catch (Exception e) {
      System.err.println("Invalid year");
      return;
    }
  }

  public static boolean leapYear(int i) {
    if (i % 400 == 0) {
      return true;
    } else if (i % 100 == 0) {
      return false;
    } else if (i % 4 == 0) {
      return true;
    }
    return false;
  }
}