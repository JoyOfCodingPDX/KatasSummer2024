package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    assertNotEquals(null, new BankOCR());
  }

}
