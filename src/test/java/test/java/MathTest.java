package test.java;

import org.junit.Assert;
import org.junit.Test;
import utils.Math;

public class MathTest {

    @Test
    public void testMaxReturnsLargestOfPositiveValues() {
        int expected = 3;
        int actual = Math.max(2,3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaxReturnsLargestOfNegativeValues() {
        int expected = -2;
        int actual = Math.max(-2,-3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinReturnsSmallestOfPositiveValues() {
        int expected = 2;
        int actual = Math.min(2,3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinReturnsSmallestOfNegativeValues() {
        int expected = -3;
        int actual = Math.min(-2,-3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAbsForPositiveValue() {
        int expected = 3;
        int actual = Math.abs(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAbsForNegativeValue() {
        int expected = 3;
        int actual = Math.abs(-3);
        Assert.assertEquals(expected, actual);
    }

}
