package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void canReadGrid(){
    String grid ="4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";
    Minesweeper obj = new Minesweeper(grid);
    assertThat(obj.grid,equalTo(grid));
  }
  @Test
  void canReadSize(){
    String grid ="4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";
    Minesweeper obj = new Minesweeper(grid);
    Integer x = Integer.parseInt(grid.split("\n")[0].split(" ")[0]);
    Integer y = Integer.parseInt(grid.split("\n")[0].split(" ")[1]);
    assertThat(x, equalTo(4));
    assertThat(y, equalTo(4));
  }

}
