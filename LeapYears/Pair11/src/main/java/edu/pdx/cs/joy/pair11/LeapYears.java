package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  public static boolean fourhundred(final int num) {
    int result = num % 400;
      return result == 0;
  }

  public static boolean onehundred(final int num) {
    int result = num % 100;
    return result != 0;
  }

  public static boolean four(final int num) {
    int result = num % 4;
    return result == 0;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    int year = Integer.parseInt(args[0]);
    //try {
    //  int year = Integer.parseInt(args[0]);
    //} catch (Exception e) {
    //  System.err.println("Invalid year: " + args[0]);
    //  System.exit(1);
    //}

  }
}