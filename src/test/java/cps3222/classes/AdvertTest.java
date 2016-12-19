package cps3222.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Etienne G on 02/12/2016.
 */

public class AdvertTest {

    Advert advert;

    @Before
    public void setUp() throws Exception {
        AdFormat adFormat = new AdFormat(MediaType.IMAGE, Dimensions.LARGE, "Business");
        advert = new Advert(0, null, null);
    }

    @After
    public void tearDown() throws Exception {
        advert = null;
    }

    @Test
    public void getSetId() throws Exception {
        advert.setId(999999);

        assertEquals(999999, advert.getId());
    }

    @Test
    public void getSetName() throws Exception {
        advert.setName("Jane De Lemur");

        assertEquals("Jane De Lemur", advert.getName());
    }

    @Test
    public void getSetAdDescription() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Video");
        list.add("Hospital");
        AdDescription adDesc = new AdDescription(list, MediaType.VIDEO, Dimensions.SMALL);

        advert.setAdDescription(adDesc);

        assertEquals(adDesc, advert.getAdDescription());
    }
}