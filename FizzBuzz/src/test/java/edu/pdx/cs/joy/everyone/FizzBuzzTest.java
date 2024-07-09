package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  @Test
  void canInstantiateKataClass() {
    new FizzBuzz();
  }

  @Test
  void fizzBuzzOfOne() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.fizzBuzz(1),equalTo("1"));
  }

  @Test
  void fizzBuzzOfTwo() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.fizzBuzz(2),equalTo("2"));
  }

  @Test
  void FizzBuzzOfThree() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.fizzBuzz(3),equalTo("Fizz"));
  }

  @Test
  void fizzBuzzOfFive() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.fizzBuzz(5),equalTo("Buzz"));
  }

  @Test
  void fizzBuzzOfFifteen() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.fizzBuzz(15),equalTo("FizzBuzz"));
  }

}
