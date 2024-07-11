package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
 All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
 All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).*/
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean dividesBy400(int input)
  {
    if ((input % 400) == 0) return true;
    return false;
  };

  public boolean dividesBy100(int input) {
    if ((input % 100) == 0) return true;
    return false;
  }

  public boolean dividesBy4(int input) {
    if ((input % 4) == 0) return true;
    return false;
  }

  public boolean algorithgm(int input){
    if (dividesBy400(input)) return true;
    if (dividesBy100(input)) return false;
    return false;
  }
}