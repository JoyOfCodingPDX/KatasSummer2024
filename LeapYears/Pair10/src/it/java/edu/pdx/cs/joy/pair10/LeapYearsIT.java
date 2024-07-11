package edu.pdx.cs.joy.pair10;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LeapYearsIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void canGetStringFromUser() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2000");
    assertEquals(Integer.parseInt(result.getTextWrittenToStandardOut()), 2000);
  }
  @Test
  void failStringFromUser() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "asdf");
    assertEquals(result.getTextWrittenToStandardOut(), "asdf");
    //assertThrows(IllegalArgumentException.class, invokeMain(LeapYears.class, "asfd"));
  }


}
