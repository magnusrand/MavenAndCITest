package test.java;

import org.junit.Assert;
import org.junit.Test;
import utils.Math;

public class MathTest {

    @Test
    public void testMaxReturnsLargestOfPositiveValues(){
        int expected = 3;
        int actual = Math.max(2,3);
        Assert.assertEquals(expected, actual);
    }

}
