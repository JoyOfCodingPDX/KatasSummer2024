package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void validCommandLineArgument() {
    assertEquals(Diamond.verifyArgument("A"), true );
  }

}
