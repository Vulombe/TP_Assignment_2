package cput.ac.za;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class TestCalculations
{
    Calculations calculations = new Calculations();
    @Test
    public void testCalculations() throws Exception {
        int result  = calculations.calculateIntegers(2,2);
        Assert.assertEquals(4,result);
    }
}
