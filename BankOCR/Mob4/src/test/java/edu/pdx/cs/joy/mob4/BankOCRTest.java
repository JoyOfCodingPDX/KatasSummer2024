package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{
  @Test
  void emptyStringTest() {
    //BankOCR bank = new BankOCR();
    assertThat(BankOCR.doOCR(""), equalTo(""));
  }

  @Test
  void threeThreeThreeTest() {
    String testResult = " _  _  _  _  _  _  _  _  _ \n" +
                        " _| _| _| _| _| _| _| _| _|\n" +
                        " _| _| _| _| _| _| _| _| _|";

    assertThat(BankOCR.doOCR(testResult), equalTo("333333333"));
  }

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

}
