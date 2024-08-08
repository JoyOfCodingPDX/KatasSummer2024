package edu.pdx.cs.joy.mob2;

public class BoardClass {
    int rowsize;
    int colsize;
    BoardClass(char[][] inputBoard) {
        this.inputBoard = inputBoard;
        this.rowsize = inputBoard.length;
        this.colsize = inputBoard[0].length;
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

    private void update(int rowIndex, int colIndex) {

        for (int row = rowIndex - 1 ; row <=  rowIndex + 1; ++row ){
            for (int col = colIndex -1 ; col <=  colIndex + 1; ++col) {
                // Ignore negative positions
                if (row < 0 || col < 0) {
                    continue;
                }
                // This is the mine
                if (row == rowIndex && col == colIndex) {
                    continue;
                }
                if (row >= rowsize) continue;
                if (col >= colsize) continue;

                resultBoard[rowIndex + 1][colIndex] = (char) (resultBoard[rowIndex + 1][colIndex] + 1);
            }

            


            }

        }

    }
}
