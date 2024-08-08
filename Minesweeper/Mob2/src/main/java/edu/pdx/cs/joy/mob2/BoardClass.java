package edu.pdx.cs.joy.mob2;

public class BoardClass {
    BoardClass(char[][] inputBoard) {
        this.inputBoard = inputBoard;
    }

    char[][] resultBoard;
    char[][] inputBoard;

    char[][] incrementBoard() {
        for (int row = 0; row < inputBoard.length; ++row) {
            System.arraycopy(inputBoard[row], 0, resultBoard[row], 0, inputBoard[row].length);
        }

        for (int row = 0; row < inputBoard.length; ++row) {
            for (int column = 0; column < inputBoard[0].length; ++column) {
                if (inputBoard[row][column] == '*') {
                    this.update(row, column);
                }
            }
        }
    }

    private void update(int row, int column) {
        if (row + 1 < resultBoard.length) {
            resultBoard[row + 1][column] = (char) (resultBoard[row + 1][column] + 1);
        }

        if (row - 1 >= 0) {
            resultBoard[row - 1][column] = (char) (resultBoard[row - 1][column] + 1);
        }

        if (column + 1 <= resultBoard[0].length) {
            resultBoard[row][column + 1] = (char) (resultBoard[row][column + 1] + 1);
        }
    }
}
