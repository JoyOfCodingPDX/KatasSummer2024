package edu.pdx.cs.joy.pair14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void testFindIndex() {
    assertEquals(Diamond.get_index("A"), 0);
    assertEquals(Diamond.get_index("a"), 0);
    assertEquals(Diamond.get_index("Z"), 25);
  }


}
