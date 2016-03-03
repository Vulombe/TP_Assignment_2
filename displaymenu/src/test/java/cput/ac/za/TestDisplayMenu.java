package cput.ac.za;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class TestDisplayMenu
{

    DisplayMenu displayMenu;
    @Before
    public void setUpDisplayMenu() throws Exception {
        displayMenu = new DisplayMenu();

    }

    @Test
    public void testName() throws Exception {
        displayMenu.displayMenu();
    }
}
