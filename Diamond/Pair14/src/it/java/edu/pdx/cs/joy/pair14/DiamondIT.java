package edu.pdx.cs.joy.pair14;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  private static void assertExpectedOutput(MainMethodResult result, String expectedOut, String expectedErr) {
    assertThat(result.getTextWrittenToStandardOut().trim(), equalTo(expectedOut));
    assertThat(result.getTextWrittenToStandardError().trim(), equalTo(expectedErr));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void aReturnsA() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A");
    assertExpectedOutput(result, "A", "");
  }


}
