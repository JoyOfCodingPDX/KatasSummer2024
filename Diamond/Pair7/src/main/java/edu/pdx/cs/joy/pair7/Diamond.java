package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.print("test");
    } else if (args[0].equals("A")) {
      System.out.print("A");
    } else if (args[0].equals("B")) {
      System.out.println(" A ");
      System.out.println("B B");
      System.out.print(" A ");
    }
    System.err.println("Missing command line arguments");
  }
}