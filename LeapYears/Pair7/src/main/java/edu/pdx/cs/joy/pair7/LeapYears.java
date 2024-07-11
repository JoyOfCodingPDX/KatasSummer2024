package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");

    int [] years = {2001, 2000, 2010, 2020, 2030, 2040};
    for(int year : years){

      System.out.print("Year : " + year);
      if(leap_year(year)){
        System.out.println(" is a leap year");
      }
      else{
        System.out.println(" is not a leap year");
      }
    }
  }

  public static boolean leap_year(int year){

    if (year % 400 == 0){
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

