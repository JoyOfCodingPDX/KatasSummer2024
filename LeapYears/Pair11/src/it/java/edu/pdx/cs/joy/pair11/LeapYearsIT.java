package edu.pdx.cs.joy.pair11;

import com.sun.tools.javac.Main;
import edu.pdx.cs.joy.InvokeMainTestCase;
import org.checkerframework.checker.fenum.qual.AwtAlphaCompositingRule;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LeapYearsIT extends InvokeMainTestCase {
  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithValidArgument() {
    LeapYears.main(new String[]{"400"});
  }

  @Test
  void invokingMainWithInvalidArgument() {
    String year[] = {"year"};
    assertThrows(Exception.class, () -> {
      LeapYears.main(year);
    });
  }
}
