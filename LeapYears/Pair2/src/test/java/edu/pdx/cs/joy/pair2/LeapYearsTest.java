package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void input2000() {
    LeapYears.LeapYear = new LeapYear();
    assertThat(LeapYears.LeapYear(2000),equalTo("1"));
  }

  void input1900() {
    LeapYears.LeapYear = new LeapYear();
    assertThat(LeapYears.LeapYear(1900),equalTo("0"));
  }

  void input2008() {
    LeapYears.LeapYear = new LeapYear();
    assertThat(LeapYears.LeapYear(2008),equalTo("1"));
  }

  void input2017() {
    LeapYears.LeapYear = new LeapYear();
    assertThat(LeapYears.LeapYear(2017),equalTo("0"));
  }

}
