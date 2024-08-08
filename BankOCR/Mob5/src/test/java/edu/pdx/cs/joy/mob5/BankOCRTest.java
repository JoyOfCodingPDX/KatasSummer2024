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

  @Test
  void canReadTwoToNine() {
    BankOCR bankOCR = new BankOCR();
    String two[][] = {{" _ "},{ " _|"},{"|_ "}};
    String three[][] = {{" _ "},{ " _|"},{" _|"}};
    String four[][] = {{"   "},{ "|_|"},{"  |"}};
    String five[][] = {{" _ "},{ "|_ "},{" _|"}};
    String six[][] = {{" _ "},{ "|_ "},{"|_|"}};
    String seven[][] = {{" _ "},{ "  |"},{"  |"}};
    String eight[][] = {{" _ "},{ "|_|"},{"|_|"}};
    String nine[][] = {{" _ "},{ "|_|"},{" _|"}};

    assertThat(bankOCR.read(two), equalTo("2"));
    assertThat(bankOCR.read(three), equalTo("3"));
    assertThat(bankOCR.read(four), equalTo("4"));
    assertThat(bankOCR.read(five), equalTo("5"));
    assertThat(bankOCR.read(six), equalTo("6"));
    assertThat(bankOCR.read(seven), equalTo("7"));
    assertThat(bankOCR.read(eight), equalTo("8"));
    assertThat(bankOCR.read(nine), equalTo("9"));
  }
}
