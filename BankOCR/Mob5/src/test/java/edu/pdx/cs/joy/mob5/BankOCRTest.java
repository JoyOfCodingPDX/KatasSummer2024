package edu.pdx.cs.joy.mob5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void canReadZero() {
    BankOCR bankOCR = new BankOCR();
    String character[][] = {{" _ "},{ "| |"},{"|_|"}};
    assertThat(bankOCR.read(character), equalTo("0"));
  }

  @Test
  void canReadOne() {
    BankOCR bankOCR = new BankOCR();
    String character[][] = {{"   "},{ "  |"},{"  |"}};
    assertThat(bankOCR.read(character), equalTo("1"));
  }

}
