import cps3222.classes.AdDescription;
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
        adDesc = new AdDescription();
    }

    @After
    public void tearDown() throws Exception {
        adDesc = null;
    }

    @Test
    public void getSetKeywords() throws Exception {
        // setup
        ArrayList<String> list = new ArrayList<String>();

        // exercise
        list.add("Business");
        list.add("Games");
        adDesc.setKeywords(list);

        // verify
        assertEquals(Arrays.asList("Business", "Games"), adDesc.getKeywords());
    }

    @Test
    public void getSetFormat() throws Exception {
        // setup
    }


}