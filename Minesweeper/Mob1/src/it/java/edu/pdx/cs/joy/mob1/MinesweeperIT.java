package edu.pdx.cs.joy.mob1;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class MinesweeperIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain(Minesweeper.class, args);
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void emptyInput() {
    //m and n cannot be
    MainMethodResult result = invokeMain("0", "0");
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void oneFourInput() {
    MainMethodResult result = invokeMain("1", "4", ".*..");
    assertThat(result.getTextWrittenToStandardOut(), containsString("1*10"));
  }
}
