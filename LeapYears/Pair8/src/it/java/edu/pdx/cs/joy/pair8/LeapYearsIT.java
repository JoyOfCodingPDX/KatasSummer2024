package edu.pdx.cs.joy.pair8;

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
  void leapYearOutput() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "4");
    assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
  }

  @Test
  void notLeapYearOutput() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "3");
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
  }

  @Test
  void nonNumericLeapYearInput() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "L");
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid command line arguments"));
  }


}
