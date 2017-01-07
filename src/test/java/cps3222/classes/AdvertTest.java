package cps3222.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


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
        // exercise
        advert.setId(999999);

        // verify
        assertEquals(999999, advert.getId());
    }

    @Test
    public void getSetName() throws Exception {
        // exercise
        advert.setName("Jane De Lemur");

        // verify
        assertEquals("Jane De Lemur", advert.getName());
    }

    @Test
    public void getSetAdDescription() throws Exception{
        // setup
        ArrayList<String> list = new ArrayList<String>();
        list.add("Video");
        list.add("Hospital");
        AdDescription adDesc = new AdDescription(list, MediaType.VIDEO, Dimensions.SMALL);

        // exercise
        advert.setAdDescription(adDesc);

        // verify
        assertEquals(adDesc, advert.getAdDescription());
    }
}