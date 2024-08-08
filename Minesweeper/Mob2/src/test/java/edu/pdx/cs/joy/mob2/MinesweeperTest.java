package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void validateInput() {
    Minesweeper mine = new Minesweeper();
    mine.parseInput("4", "4");
    int row = mine.getRow();
    int col = mine.getCol();
    assertThat(String.valueOf(col), equals(4));

  }

}
