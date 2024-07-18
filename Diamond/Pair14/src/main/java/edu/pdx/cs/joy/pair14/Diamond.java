package edu.pdx.cs.joy.pair14;

import com.google.common.annotations.VisibleForTesting;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length < 1) {
      System.err.println("Missing command line arguments");
    }

    if(args.length > 1) {
      System.err.println("Invalid command line arguments");
    }

    if(args[0].length() != 1) {
      System.err.println("Invalid command line arguments");
    }
    if(!Character.isLetter(args[0].charAt(0))) {
      System.err.println("Invalid command line arguments");
    }

    int middle_index = get_index(args[0]);
  }

  public static int get_index(String letter) {
    return alphabet.indexOf(letter.toUpperCase());
  }
}