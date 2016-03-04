package cput.ac.za;

import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestPrintResults
{
    PrintResults printResults = new PrintResults();

    @Test
    public void testName() throws Exception {

        int a = 2;
        int b = 3;
        int sum = a + b;

        System.out.println(printResults.printResults(a,b,sum));
    }
}
