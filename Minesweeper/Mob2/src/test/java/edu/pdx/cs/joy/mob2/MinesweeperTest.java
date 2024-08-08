package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void validateInputSuccess() {
    Minesweeper mine = new Minesweeper();
    mine.parseInput("4", "4");
    int row = mine.getRow();
    int col = mine.getCol();
    assertEquals(col, 4);
    assertEquals(row, 4);
  }

  @Test
  void twoDimensionalArrayCreatedSuccess(){
    String args = "3 4";
    Minesweeper mine = new Minesweeper(args);


    assertEquals(mine.fieldArray[0].length(), 4);
    assertEquals(mine.fieldArray.length(), 3);

  }

}
