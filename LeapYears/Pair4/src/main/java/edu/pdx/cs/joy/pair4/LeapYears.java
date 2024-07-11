package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import static java.lang.Integer.parseInt;

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

    int year = -1;
    LeapYears leapYears = new LeapYears();
    try{
      year = parseInt(args[0]);
    }
    catch(NumberFormatException e)
    {
      System.err.println("Input must be a number.");
      System.exit(1);
    }
    

    if (leapYears.isLeapYear(year)) {
      System.out.println(year + " is a Leap year.");
    }
    else
    {
      System.out.println(year + " is not a Leap year.");
    }
  }

  public boolean isLeapYear(int year)
  {

    if( (year % 400) == 0){
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    if(year % 4 == 0){
      return true;
    }
    return false;
  }
}