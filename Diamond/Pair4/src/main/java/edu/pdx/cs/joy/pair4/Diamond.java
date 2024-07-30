package edu.pdx.cs.joy.pair4;

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
    //System.err.println("Missing command line arguments");
    char letter = 'C';
    int n = letter - 'A';

    for(int i = 0; i<=n; ++i)
    {
      //Print whitespace
      for(int j = 0; j < n - i; ++j) {
        System.out.print(" ");
      }

      //Print first character
      System.out.print((char) (i + 'A'));

      //Print whitespace
      for(int j = 0; j < i; ++j) {
        System.out.print(" ");
      }

      //Print second character
      System.out.print((char) (i + 'A'));
      System.out.println();
    }
  }
}