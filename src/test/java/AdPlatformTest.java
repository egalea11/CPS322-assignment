import cps3222.classes.AdPlatform;

import org.junit.*;


/**
 * Created by SterlingRyan on 02/12/2016.
 */

public class AdPlatformTest {
    AdPlatform adPlatform;

    @Before
    public void setUp() throws Exception {
        adPlatform = new AdPlatform();
    }

    @After
    public void tearDown() throws Exception {
        adPlatform = null;
    }

    @Test
    public void simpleRegisterAffiliate() {

        // Setup
        Affiliate affiliate = new Affiliate(1,"Hello");
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        Affiliate returnedAffliate = adPlatform.getAffiliatesDatabase().get(1);

        //Test
        assertEquals(returnedAffliate, affiliate);
    }

    @Test
    public void insertSameIdAffiliate(){

        // Setup
        Affiliate affiliate1 = new Affiliate(1,"Hello");
        Affiliate affiliate2 = new Affiliate(1,"Trump");
        adPlatform.registerAffiliate(affiliate1);
        adPlatform.registerAffiliate(affiliate2);

        //Exercise
        Affiliate returnedAffliate = adPlatform.getAffiliatesDatabase().get(1);

        //Test
        assertEquals(returnedAffliate.getName(),"Hello");

    }

    @Test
    public void noSettlingOfBalanceBelowFive(){

        //Setup
        Affiliate affiliate = new Affiliate(1,"HelpMe");

        //Exercise
        affiliate.setBalance(4.99);

        //Test
        assertEquals(4.99, affiliate.getBalance(), 0.01);

    }

    @Test
    public void testCommissionBronze(){

    }

    @Test
    public void serveAdvert()  {

    }

    @Test
    public void adClicked() {

    }

}