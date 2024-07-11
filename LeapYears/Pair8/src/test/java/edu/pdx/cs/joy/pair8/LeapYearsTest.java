package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest {
    LeapYears leapYears = new LeapYears();

    @Test
    void canInstantiateKataClass() {
        new LeapYears();
    }

    @Test
    void isDivisibleBy400() {
        assertEquals(leapYears.isLeapYear(400), true);
    }

    @Test
    void isDivisibleBy100Not400() {
        assertEquals(leapYears.isLeapYear(100), false);
    }

    @Test
    void isDivisibleBy4Not100() {
        assertEquals(leapYears.isLeapYear(4), true);
    }

}


