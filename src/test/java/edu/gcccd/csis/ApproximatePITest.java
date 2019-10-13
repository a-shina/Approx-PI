package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;

public class ApproximatePITest {

    @Test
    public void value() {
        float value = ApproximatePI.value();
        Assert.assertEquals(Math.PI, value, 0.00001);
    }
}