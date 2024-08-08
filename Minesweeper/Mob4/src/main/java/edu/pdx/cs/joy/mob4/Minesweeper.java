package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 * <p>
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
                board[i][j] = argSplit[i + 1].charAt(j);
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

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                solution[i][j] = 0;
            }
        }

//        // Print the array to verify
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '*') {
                    solution[i][j] = '*';
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (k == 0 && l == 0) continue;
                            solution[i + k][j + l] = getMagicIncrementFunction(solution[i + k][j + l]);
                        }
                    }
                }
            }
        }


        return solution;
    }

    private static char getMagicIncrementFunction(char c) {
        if (c == '*') {
            return c;
        } else {
            return (char) (c+1);
        }

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