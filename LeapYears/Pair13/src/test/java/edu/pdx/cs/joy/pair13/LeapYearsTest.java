package edu.pdx.cs.joy.pair13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass()
  {
    new LeapYears();
  }

  @Test
  void isAnInt()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.leapYears("2000"),equalTo(true));

  }
}


