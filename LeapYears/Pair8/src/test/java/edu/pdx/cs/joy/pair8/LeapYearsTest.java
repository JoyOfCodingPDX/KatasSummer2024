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
        assertEquals(leapYears.isLeapYear(2000), true);
    }

    @Test
    void isDivisibleBy100Not400() {
        assertEquals(leapYears.isLeapYear(1700), false);
        assertEquals(leapYears.isLeapYear(1800), false);
        assertEquals(leapYears.isLeapYear(1900), false);
    }

    @Test
    void isDivisibleBy4Not100() {
        assertEquals(leapYears.isLeapYear(2008), true);
        assertEquals(leapYears.isLeapYear(2012), true);
        assertEquals(leapYears.isLeapYear(2016), true);
    }

    @Test
    void allYearsNotDivisibleBy4() {
        assertEquals(leapYears.isLeapYear(2017), false);
        assertEquals(leapYears.isLeapYear(2018), false);
        assertEquals(leapYears.isLeapYear(2019), false);

    }

}


