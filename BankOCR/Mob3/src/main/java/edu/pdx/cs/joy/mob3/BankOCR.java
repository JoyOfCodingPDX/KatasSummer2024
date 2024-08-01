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
    HashMap<String, String> numbers = new HashMap<String, String>();
    numbers.put(" _ | ||_|", "0");
    numbers.put("     |  |", "1");
    numbers.put(" _  _||_ ", "2");
    numbers.put(" _  _| _|", "3");
    numbers.put("   |_|  |", "4");
    numbers.put(" _ |_  _|", "5");
    numbers.put(" _ |_ |_|", "6");
    numbers.put(" _   |  |", "7");
    numbers.put(" _ |_||_|", "8");
    numbers.put(" _ |_| _|", "9");
    String input = "";
    String tracker = "";

    String line1 = args[0];
    String line2 = args[1];
    String line3 = args[2];

    for (int i = 0; i < 9; i++) {
      input = line1.substring(i*3,i*3+2) + line2.substring(i*3,i*3+2) + line3.substring(i*3,i*3+2);
    }

  }
}