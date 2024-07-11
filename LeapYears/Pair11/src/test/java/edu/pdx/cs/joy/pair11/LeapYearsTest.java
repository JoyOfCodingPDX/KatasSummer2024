package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    LeapYears lp = new LeapYears();
    assertEquals(lp.getClass(), LeapYears.class);
  }
}
