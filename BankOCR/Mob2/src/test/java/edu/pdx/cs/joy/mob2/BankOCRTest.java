package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest {

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void canParseTheNumber1() {
    BankOCR bankOCR = new BankOCR();

   assertThat(bankOCR.parse("     |  |"), equalTo(1));
  }

}
