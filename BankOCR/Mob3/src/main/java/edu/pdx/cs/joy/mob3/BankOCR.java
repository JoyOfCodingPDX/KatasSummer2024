package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

import java.util.HashMap;

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
    HashMap<String, Integer> numbers = new HashMap<String, Integer>();
//    numbers.put("");

    for (int i = 0; i < 9; i++) {
    }

    String line1 = args[0];
    String line2 = args[1];
    String line3 = args[2];
    System.out.printf("%s\n%s\n%s\n", line1, line2, line3);
  }
}