package cput.ac.za;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestItems
{
    Items items;

    @Before
    public void setUpItems() throws Exception {

        items = new Items("Playstation","Game",12000.00);
    }


    @Test
    public void testItems() throws Exception {
       System.out.println(items.toString());
    }
}
