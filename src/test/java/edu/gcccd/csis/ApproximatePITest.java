package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApproximatePITest {

    @Test
    public void value() {
            float value = ApproximatePI.value();
            Assert.assertEquals(Math.PI, value, 0.00001);
    }
}