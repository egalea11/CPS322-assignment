package cps3222.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Etienne G on 02/12/2016.
 */

public class AdvertTest {

    Advert advert;

    @Before
    public void setUp() throws Exception {
        advert = new Advert("123456", "John Doe", );
    }

    @After
    public void tearDown() throws Exception {
        advert = null;
    }


    @Test
    public void getSetId() throws Exception {

    }

    @Test
    public void getSetName() throws Exception {

    }

    @Test
    public void getSetAdFormat() throws Exception {

    }

    @Test
    public void serveAdvert() throws Exception {

    }
}