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
    assertThat(fizzBuzz.fizzBuzz(1),equalTo(1));
  }

}
