package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {

    new Minesweeper();
  }

  @Test
  void canGetBoardSize() {
    assertThat(Minesweeper.getBoardSize(), new int[]{2, 3});
  }


}
