package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  void printLine(int letter, int steps, int spaces) {
   System.out.println((char)letter);
  }

  static Boolean validateInput(String input) {
    int letter = input.toCharArray()[0];
    System.out.println(letter);
      return input.length() == 1 && letter > 64 && letter < 91;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0)
      return;

    if (validateInput(args[0])) {
     System.out.println("hi");
    }
  }
}