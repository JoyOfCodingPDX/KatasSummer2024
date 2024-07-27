package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Disabled;
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
    assertEquals(Diamond.verifyArgument("A"), 'A' );
    assertEquals(Diamond.verifyArgument("B"), 'B' );
  }

  @Test
  void invalidCommandLineArgument() {
    assertEquals(Diamond.verifyArgument("12312342135234534"), '0' );
  }

  @Disabled
  @Test
  void printDiamondA() {
    assertEquals(Diamond.diamondString('A'), "A");
  }

  @Disabled
  @Test
  void printDiamondB() {
    assertEquals(Diamond.diamondString('B'), " A\nB B\n A\n");
  }

}
