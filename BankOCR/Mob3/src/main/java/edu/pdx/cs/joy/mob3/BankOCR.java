package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length < 3) {
      System.err.println("Too few command line arguments");
      return;
    }
    String line1 = args[0];
    String line2 = args[1];
    String line3 = args[2];
    System.out.printf("%s\n%s\n%s\n");
  }
}