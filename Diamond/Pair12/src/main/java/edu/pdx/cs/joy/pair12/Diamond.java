package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  static int letter = 0;

  static Boolean validateInput(String input) {
    letter = input.toCharArray()[0];
    System.out.println(letter);
      return input.length() == 1 && letter > 64 && letter < 91;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0)
      return;
    if (!validateInput(args[0]))
      return;

    int diff = letter - (int)'A';
    for (int i = diff; i > 0; --i)
      System.out.print(" ");
    System.out.print("A");
    for (int i = diff; i > 0; --i)
      System.out.print(" ");

    int OUT = diff;
    int IN = 0;
    int curr = 'A';
    for (int i = 0; i < diff; ++i) {
      for (int j = OUT; j > 0; --j)
        System.out.print(" ");
      System.out.print((char)curr);

    }

  }
}