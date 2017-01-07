package cps3222.classes;

import cps3222.classes.AdDescription;
import cps3222.classes.AdFormat;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Etienne G on 02/12/2016.
 */

public class AdDescriptionTest {

    AdDescription adDesc;

    @Before
    public void setUp() throws Exception {
        adDesc = new AdDescription(new ArrayList<String>(),null, null);
    }

    @After
    public void tearDown() throws Exception {
        adDesc = null;
    }

    @Test
    public void testInitList() throws Exception {
        // setup
        ArrayList<String> list = new ArrayList<String>();

        // exercise
        adDesc.initList();

        // add keywords after running method
        list.add("gaming");
        list.add("business");
        list.add("sports");

        // verify
        assertEquals(list, adDesc.getKeywords());
    }

    @Test
    public void getKeywords() throws Exception {
        // exercise
        adDesc.initList();

        // verify
        assertEquals(Arrays.asList("gaming", "business", "sports"), adDesc.getKeywords());
    }

    @Test
    public void getSetKeywords() throws Exception {
        // setup
        adDesc.initList();
        ArrayList<String> list = new ArrayList<String>();

        // exercise
        list.add("government");
        adDesc.setKeywords(list);

        // verify
        assertEquals(Arrays.asList("gaming", "business", "sports", "government"), adDesc.getKeywords());
    }

    @Test
    public void getSetMediaType() throws Exception {
        // setup
        MediaType mediatype = MediaType.IMAGE;

        // exercise
        adDesc.setMediaType(mediatype);

        // verify
        assertEquals(mediatype, adDesc.getMediaType());
    }

    @Test
    public void getSetDimension() throws Exception {
        // setup
        Dimensions dimension = Dimensions.LARGE;

        // exercise
        adDesc.setDimensions(dimension);

        // verify
        assertEquals(dimension, adDesc.getDimensions());
    }
}