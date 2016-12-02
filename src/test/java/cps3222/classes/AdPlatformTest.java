package cps3222.classes;

import cps3222.classes.AdPlatform;

import cps3222.classes.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;


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
        adPlatform.registerAffiliate(affiliate);
        adPlatform.settleAffiliateBalance(affiliate);

        //Test
        assertEquals(4.99, affiliate.getBalance(), 0.01);

    }

    @Test
    public void changeInAffiliateTypeSilverToBronze(){
        //Setup
        Affiliate affiliate = new Affiliate(1,"HelpMe");
        affiliate.setBalance(50.00);
        affiliate.setType(AffiliateType.SILVER);

        //Exercise
        adPlatform.settleAffiliateBalance(affiliate);

        //Test
        assertEquals(AffiliateType.BRONZE, affiliate.getType());
    }

    @Test
    public void changeInAffiliateTypeGoldToBronze(){
        //Setup
        Affiliate affiliate = new Affiliate(1,"HelpMe");
        affiliate.setBalance(500.0);
        affiliate.setType(AffiliateType.GOLD);

        //Exercise
        adPlatform.settleAffiliateBalance(affiliate);

        //Test
        assertEquals(AffiliateType.BRONZE, affiliate.getType());
    }


    @Test
    public void keywordFoundInServeAdvert(){

        //Setup
//        AdFormat adFormat = new AdFormat();
//        Advert advert = new Advert(1,"Hello",);

    }

    @Test
    public void serveAdvert()  {

    }

    @Test
    public void adClicked() {

    }

}