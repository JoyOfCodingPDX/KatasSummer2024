package edu.pdx.cs.joy.pair14;

import com.google.common.annotations.VisibleForTesting;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  private static final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static int get_index(String letter) {
    return ArrayUtils.indexOf(alphabet, letter.toUpperCase());
  }
}