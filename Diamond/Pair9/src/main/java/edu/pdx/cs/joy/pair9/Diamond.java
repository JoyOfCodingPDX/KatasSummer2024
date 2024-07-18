package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

import static java.lang.Character.isLetter;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static char verifyArgument(String args) {
    Character ch = args.charAt(0);
    if(isLetter(ch)) {
        ch = Character.toUpperCase(ch);
        return ch;
    }
    return '0';
  }

  public static String diamondString(char a) {

  }
}