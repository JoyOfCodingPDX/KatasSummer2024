package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class DiamondTest {

  @Disabled
  @Test
  void userInputA() {
    String input = "A";
    assertThat(new Diamond(input), equalTo("A"));
  }
}