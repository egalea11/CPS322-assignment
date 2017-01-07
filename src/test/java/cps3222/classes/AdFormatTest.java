package cps3222.classes;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Etienne G on 02/12/2016.
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
