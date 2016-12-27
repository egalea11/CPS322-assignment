package cps3222.classes;

import cps3222.classes.AdDescription;
import cps3222.classes.AdFormat;
import cps3222.classes.Dimensions;
import cps3222.classes.MediaType;

import cps3222.stubtests.StubbedAdDescriptionKeywords;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Ettienne G on 02/12/2016.
 */

public class AdFormatTest {

    AdFormat adFormat;

    @Before
    public void setUp(){
        adFormat = new AdFormat(null, null, null);
    }

    @After
    public void tearDown(){
        adFormat = null;
    }

    @Test
    public void getSetMediaType() {
        // setup
        MediaType image = MediaType.IMAGE;

        // exercise
        adFormat.setMediaType(image);

        // verify
        assertEquals(MediaType.IMAGE, adFormat.getMediaType());
    }

    @Test
    public void getSetDimensions() {
        // setup
        Dimensions small = Dimensions.SMALL;

        // exercise
        adFormat.setDimensions(small);

        // verify
        assertEquals(Dimensions.SMALL, adFormat.getDimensions());
    }

    @Test
    public void getSetKeywords() {
        // setup
        String string = "string";

        // exercise
        adFormat.setKeyword(string);

        // verify
        assertEquals("string", adFormat.getKeyword());
    }
}
