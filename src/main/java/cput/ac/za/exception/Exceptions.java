package cput.ac.za.exception;

import java.util.ArrayList;

/**
 * Created by student on 2016/03/03.
 */
public class Exceptions
{
    public void exceptionTest()
    {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
}
