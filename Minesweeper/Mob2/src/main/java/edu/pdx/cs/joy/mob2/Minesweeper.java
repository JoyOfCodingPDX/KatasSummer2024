package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {
    private int row;
    private int col;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void parseInput(String number, String number1) throws IllegalArgumentException {

      int row = Integer.parseInt(number);
      int col = Integer.parseInt(number1);

      if (row < 0 || row > 100) {
        throw new IllegalArgumentException("Error: row out of range " + number);
      }
      if (col < 0 || col > 100) {
        throw new IllegalArgumentException("Error: col out of range " + number1);
      }

      this.row = row;
      this.col = col;

  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }
}