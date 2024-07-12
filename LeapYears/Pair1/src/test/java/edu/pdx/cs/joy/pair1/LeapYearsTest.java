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
  void multipleOf400dividesBy400returnsTrue()
  {

    // Assemble
    int input = 4000;
    LeapYears calculator = new LeapYears();

    //Act
    boolean response = calculator.dividesBy400(input);
    //Assert
    assertEquals(response, true);
  }
  @Test
  void multipleOf100divisidesBy100ReturnsTrue()
  {
    int input = 1000;
    LeapYears calculator = new LeapYears();

    //Act
    boolean response = calculator.dividesBy100(input);
    //Assert
    assertEquals(response, true);

  }
  @Test
  void multipleOfFourDividesBy4IsTrue()
  {
    int input = 44;
    LeapYears calculator = new LeapYears();

    //Act
    boolean response = calculator.dividesBy4(input);
    //Assert
    assertEquals(response, true);

  }

  @Test
  void realLeapYearAlgorithmreturnsTrue()
  {
    int input = 2000;
    LeapYears calculator = new LeapYears();
    boolean response = calculator.algorithgm(input);

    assertEquals(response, true);
  }


}
