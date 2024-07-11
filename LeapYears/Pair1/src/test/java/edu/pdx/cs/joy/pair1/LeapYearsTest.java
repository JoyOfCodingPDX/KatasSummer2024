package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    int input = 4000;
    LeapYears calculator = new LeapYears();

    //Act
    boolean response = calculator.dividesBy400(input);
    //Assert
    assertEquals(response, true);
  }



}
