package edu.pdx.cs.joy.pair8;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 */
public class LeapYears {

    @VisibleForTesting
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Missing command line arguments");
            return;
        }

        LeapYears leapYears = new LeapYears();
        int year = Integer.parseInt(args[0]);
        if (leapYears.isLeapYear(year)) {
            System.out.println("Leap year " + year + " is a leap year");
        } else {
            System.out.println("Leap year " + year + " is not a leap year");
        }
    }

    public boolean isLeapYear(int i) {
        if (i % 400 == 0) {
            return true;
        } else if (i % 100 == 0) {
            return false;
        } else if (i % 4 == 0) {
            return true;
        } else return false;
    }
}