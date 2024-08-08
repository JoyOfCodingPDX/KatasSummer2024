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
      String[] argSplit = args[0].split("\n");
      int[] dimensions = getBoardSize(argSplit[0]);
      char[][] board = new char[dimensions[0]][dimensions[1]];

      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[0].length; j++) {
              board[i][j] = argSplit[i+1].charAt(j);
          }
      }

      // char[][] solution = solveMinesweeper(board);


      /*
        4 4 argSplit[0]
        .... argSplit[1]
        .... argSplit[2]
        .... argSplit[3]
        .... argSplit[4]
       */


  }

  public static char[][] solveMinesweeper(char[][] board) {
      char[][] solution = new char[board.length][board[0].length];



      return solution;
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