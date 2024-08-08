package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {

    new Minesweeper();
  }

  @Test
  void canGetBoardSize() {
    assertThat(Minesweeper.getBoardSize("4 4"), equalTo(new int[]{4, 4}));
  }

  @Test
  void canGetMinesweeperSolution() {
    char[][] board = new char[][]{{'*', '.'}, {'.', '.'}};
    assertThat(Minesweeper.solveMinesweeper(board), equalTo(new char[][]{{'*', '1'}, {'1', '1'}}));
  }

  @Test
  void testgetMagicIncrementFunction() {
    assertThat(Minesweeper.getMagicIncrementFunction('0'), equalTo('1'));
    assertThat(Minesweeper.getMagicIncrementFunction('*'), equalTo('*'));
  }
}
