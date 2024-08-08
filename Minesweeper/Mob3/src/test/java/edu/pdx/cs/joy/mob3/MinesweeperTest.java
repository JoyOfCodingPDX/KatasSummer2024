package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
    assertThat(obj.x, equalTo(4));
    assertThat(obj.y, equalTo(4));
  }

  @Test
  void canParseRows() {
    String grid ="4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";
    Minesweeper obj = new Minesweeper(grid);

    ArrayList<String> lines = new ArrayList<String>(Arrays.asList(obj.grid.split("\n")));
    ArrayList<char[]> twoDGrid = new ArrayList<>();
    boolean ignoredFirst = false;
    for (String line : lines) {
      if (!ignoredFirst) ignoredFirst = true;
      else twoDGrid.add(line.toCharArray());
    }

    assertThat(twoDGrid.get(2)[1], equalTo('*'));
  }
}
