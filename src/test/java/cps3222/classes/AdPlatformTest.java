package cps3222.classes;

import cps3222.classes.AdPlatform;

import cps3222.classes.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;

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
    public void setGetAffiliateDatabase(){
        //Setup
        HashMap<Integer, Affiliate> hashMap = null;

        //Exercise
        adPlatform.setAffiliatesDatabase(hashMap);

        //Test
        assertEquals(null, adPlatform.getAffiliatesDatabase());
    }

    @Test
    public void setGetAdvertDatabase(){
        //Setup
        HashMap<Integer, Advert> hashMap = null;

        //Exercise
        adPlatform.setAdvertDatabase(hashMap);

        //Test
        assertEquals(null, adPlatform.getAdvertDatabase());

    }
    @Test
    public void simpleRegisterAffiliate() {

        // Setup
        Affiliate affiliate = new Affiliate(1,"Hello", "123");
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        Affiliate returnedAffliate = adPlatform.getAffiliatesDatabase().get(1);

        //Test
        assertEquals(returnedAffliate, affiliate);
    }

    @Test
    public void insertSameIdAffiliate(){

        // Setup
        Affiliate affiliate1 = new Affiliate(1,"Hello", "123");
        Affiliate affiliate2 = new Affiliate(1,"Trump", "123");
        adPlatform.registerAffiliate(affiliate1);
        adPlatform.registerAffiliate(affiliate2);

        //Exercise
        Affiliate returnedAffiliate = adPlatform.getAffiliatesDatabase().get(1);

        //Test
        assertEquals(returnedAffiliate.getName(),"Hello");

    }

    @Test
    public void insertSameIdAdvert(){

        // Setup
        Advert advert1 = new Advert(1,"Bye",null);
        Advert advert2 = new Advert(1,"Hello",null);
        adPlatform.registerAdvert(advert1);
        adPlatform.registerAdvert(advert2);

        //Exercise
        Advert returnedAdvert = adPlatform.getAdvertDatabase().get(1);

        //Test
        assertEquals(returnedAdvert.getName(),"Bye");

    }

    @Test
    public void noSettlingOfBalanceBelowFive(){

        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");

        //Exercise
        affiliate.setBalance(4.99);
        adPlatform.registerAffiliate(affiliate);
        adPlatform.settleAffiliateBalance(affiliate);

        //Test
        assertEquals(4.99, affiliate.getBalance(), 0.01);

    }

    @Test
    public void settlingBronzeAffiliate(){
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(30.00);

        //Exercise
        adPlatform.settleAffiliateBalance(affiliate);

        //Test
        assertEquals(0.0, affiliate.getBalance(), 0.01);
    }

    @Test
    public void changeInAffiliateTypeSilverToBronze(){
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
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
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
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
        AdFormat adFormat = new AdFormat(MediaType.IMAGE,Dimensions.LARGE,"VideoGame");
        Advert advert = new Advert(1,"Hello",adFormat);
        adPlatform.registerAdvert(advert);
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("Video");
        keywords.add("VideoGame");
        keywords.add("");
        AdDescription adDescription = new AdDescription(keywords,adFormat);


        // Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adDescription);

        // Test
        assertEquals(returnedAdvert, advert);
    }

    @Test
    public void keywordNotFoundInServeAdvert(){

        //Setup
        AdFormat adFormat = new AdFormat(MediaType.IMAGE,Dimensions.LARGE,"VideoGame");
        Advert advert = new Advert(1,"Hello",adFormat);
        adPlatform.registerAdvert(advert);
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("Video");
        keywords.add("Doctor");
        keywords.add("");
        AdDescription adDescription = new AdDescription(keywords,adFormat);


        // Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adDescription);

        // Test
        assertEquals(returnedAdvert, null);
    }

    @Test
    public void AdMediaTypeMismatchInServeAdvert(){

        //Setup
        AdFormat adFormat1 = new AdFormat(MediaType.VIDEO,null,null);
        AdFormat adFormat2 = new AdFormat(MediaType.IMAGE,null,null);
        Advert advert = new Advert(1,"Hello",adFormat1);
        adPlatform.registerAdvert(advert);
        AdDescription adDescription = new AdDescription(null,adFormat2);

        //Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adDescription);

        // Test
        assertEquals(returnedAdvert, null);
    }

    @Test
    public void adClickedChangeToSilver() {
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(49.95);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.AdClicked(1);

        //Test
        assertEquals(AffiliateType.SILVER, affiliate.getType());
    }

    @Test
    public void adClickedChangeToGold() {
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(499.95);
        affiliate.setType(AffiliateType.SILVER);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.AdClicked(1);

        //Test
        assertEquals(AffiliateType.GOLD, affiliate.getType());
    }

}