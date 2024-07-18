package edu.pdx.cs.joy.pair5;

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
    char letter = 'C';
    int letterNumValue = letter - 'A' + 1;

    System.out.println(letterNumValue);
    System.out.println(letter);

    System.err.println("Missing command line arguments");
  }
}