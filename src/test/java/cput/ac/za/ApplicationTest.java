package cput.ac.za;

import cput.ac.za.arraycontent.ArrayContent;
import cput.ac.za.boleans.False;
import cput.ac.za.exception.Exceptions;
import cput.ac.za.failing.Failing;
import cput.ac.za.floatingPoint.FloatingPoint;
import cput.ac.za.integers.*;
import cput.ac.za.nulls.NonNullNess;
import cput.ac.za.nulls.NullNess;
import cput.ac.za.objectEquality.ObjectEquality;
import cput.ac.za.objectIdentity.ObjectIdentity;
import cput.ac.za.boleans.Truth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Created by student on 2016/03/02.
 */
public class ApplicationTest
{
    FloatingPoint fl = new FloatingPoint();
    Integers in = new Integers();
    ObjectEquality oe = new ObjectEquality();
    ObjectIdentity oi = new ObjectIdentity();
    ObjectIdentity oi2 = new ObjectIdentity();
    Truth truth = new Truth();
    False aFalse = new False();
    NullNess nullNess = new NullNess();
    NonNullNess nonNullNess = new NonNullNess();
    ArrayContent arrayContent = new ArrayContent();
    Exceptions exception = new Exceptions();

    Failing failing = new Failing();
    //Calculations calculations = new Calculations();
    @Before
    public void setUpApplication() throws Exception {
        System.out.println("Hello Welcome to my application");
    }

    @Test
    public void testFloatingPoint() throws Exception
    {
        float result  = fl.calculateFloat((float)1.2,(float)1.2);
        Assert.assertEquals((float)2.4,result,.0);


    }

    @Test
    public void testIntegers() throws Exception
    {
        int result  = in.calculateIntegers(2,2);
        Assert.assertEquals(4,result);
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals("Vulombe",oe.displayName());
    }

    @Test
    public void testObjectIdentity() throws Exception {

        Assert.assertNotSame(oi2, oi);
    }

    @Test
    public void testTruth() throws Exception
    {
        Assert.assertTrue(truth.isEmpty());
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(aFalse.isEmpty());
    }

    @Test
    public void testNullNess() throws Exception{
        Assert.assertNull(nullNess.isNull());
    }

    @Test
    public void testNonNullNess() throws Exception{
        Assert.assertNotNull(nonNullNess.isNotNull());
    }

    @Ignore
    @Test
    public void testFailing() throws Exception {
        Assert.fail(failing.failMessage());

    }
    @Test
    public void testArrayContents() throws Exception
    {
        Assert.assertArrayEquals(arrayContent.names2, arrayContent.names);
    }

   @Test(expected=IndexOutOfBoundsException.class)
    public void testException() throws Exception
    {
        exception.exceptionTest();
    }
}
