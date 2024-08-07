package edu.pdx.cs.joy.mob3;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class BankOCRIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) { return invokeMain(BankOCR.class, args); }
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString("Too few command line arguments"));
  }

  @Disabled
  @Test
  void testInitialCommandLineArgs() {
    MainMethodResult result = invokeMain("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|",  "||_  _|  | _||_|  ||_| _|");
    assertThat(result.getTextWrittenToStandardOut(), containsString("    _  _     _  _  _  _  _ "));
  }

  @Disabled
  @Test
  void validInputToBeTurnedIntoDigits() {
    MainMethodResult result = invokeMain("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|",  "||_  _|  | _||_|  ||_| _|");
    assertThat(result.getTextWrittenToStandardOut(), containsString("123456789"));
  }

}
