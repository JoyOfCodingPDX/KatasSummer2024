package edu.pdx.cs.joy.pair3;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardOut() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "3");
    assertThat(result.getTextWrittenToStandardOut(), containsString("false"));
  }


}
