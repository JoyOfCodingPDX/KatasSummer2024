package edu.pdx.cs.joy.mob4;

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
    System.err.println("Missing command line arguments");
  }

  public static int[] getBoardSize(String dimensions) {

    int column = 0;
    int row = 0;

    column = Integer.parseInt(dimensions.split(" ")[0]);
    row = Integer.parseInt(dimensions.split(" ")[1]);

    int[] dimensionsArray = {row, column};

    return dimensionsArray;
  }
}