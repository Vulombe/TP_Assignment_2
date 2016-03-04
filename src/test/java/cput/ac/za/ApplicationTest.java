package cput.ac.za;

import cput.ac.za.arraycontent.ArrayContent;
import cput.ac.za.boleans.False;
import cput.ac.za.disabling.Disabling;
import cput.ac.za.exception.Exceptions;
import cput.ac.za.failing.Failing;
import cput.ac.za.floatingPoint.FloatingPoint;
import cput.ac.za.integers.*;
import cput.ac.za.nulls.NonNullNess;
import cput.ac.za.nulls.NullNess;
import cput.ac.za.objectEquality.ObjectEquality;
import cput.ac.za.objectIdentity.ObjectIdentity;
import cput.ac.za.boleans.Truth;
import cput.ac.za.timeouts.TimeOuts;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Created by student on 2016/03/02.
 */
public class ApplicationTest
{
    FloatingPoint floatingPoint;
    Integers integers;
    ObjectEquality objectEquality;
    ObjectIdentity objectIdentity;
    ObjectIdentity objectIdentity1;
    Truth truth;
    False aFalse;
    NullNess nullNess;
    NonNullNess nonNullNess;
    ArrayContent arrayContent;
    Exceptions exception;
    Failing failing;
    TimeOuts timeOuts;
    Disabling disabling;

    @Before
    public void setUpApplication() throws Exception {
        floatingPoint = new FloatingPoint();
        integers = new Integers();
        objectEquality = new ObjectEquality();
        objectIdentity = new ObjectIdentity();
        objectIdentity1 = new ObjectIdentity();
        truth = new Truth();
        aFalse = new False();
        nullNess = new NullNess();
        nonNullNess = new NonNullNess();
        arrayContent = new ArrayContent();
        exception = new Exceptions();
        failing = new Failing();
        timeOuts = new TimeOuts();
        disabling = new Disabling();
    }

    @Test
    public void testFloatingPoint() throws Exception
    {
        float result  = floatingPoint.calculateFloat((float)1.2,(float)1.2);
        Assert.assertEquals((float)2.4,result,.0);


    }

    @Test
    public void testIntegers() throws Exception
    {
        int result  = integers.calculateIntegers(2,2);
        Assert.assertEquals(4,result);
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals("Vulombe",objectEquality.displayName());
    }

    @Test
    public void testObjectIdentity() throws Exception {

        Assert.assertNotSame(objectIdentity1, objectIdentity);
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

    @Test (timeout = 100)
    public void testTimeOut() throws Exception
    {
        timeOuts.countingNumbers();
    }

    @Ignore ("Not Yet Ready")
    public void testDisabling() throws Exception {
        disabling.disable();
    }
}
