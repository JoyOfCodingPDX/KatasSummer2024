package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void divisibleby400returnsTrue()
  {

    // Assemble
    string input = "4000";
    LeapYears calculator = new LeapYears();

    //Act
    boolean response = calculator.dividesBy400(input);
    //Assert


  }

}
