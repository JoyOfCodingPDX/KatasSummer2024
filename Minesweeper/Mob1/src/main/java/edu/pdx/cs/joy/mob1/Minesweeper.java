package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 3) {
      System.err.println("Missing command line arguments");
    }

    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    Character[][] field = new Character[m][n];
    for (int i = 2; i < args.length; ++i) {
      for (int j = 0; j < n; ++j) {
        field[i-2][j] = args[i].charAt(j);
      }
    }

    for (int i = 0; i < n; )
  }
}