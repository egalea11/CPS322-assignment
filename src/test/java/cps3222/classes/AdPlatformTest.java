package cps3222.classes;

import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by EuroRyan on 02/12/2016.
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
        adPlatform.settleAffiliateBalance(1);

        //Test
        assertEquals(4.99, adPlatform.getAffiliatesDatabase().get(1).getBalance(), 0.01);
    }

    @Test
    public void settlingBronzeAffiliate(){
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(30.00);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.settleAffiliateBalance(1);

        //Test
        assertEquals(0.0, adPlatform.getAffiliatesDatabase().get(1).getBalance(), 0.01);
    }

    @Test
    public void settlingSilverAffiliate(){
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(100.00);
        affiliate.setCumulativeBalance(100.00);
        affiliate.setType(AffiliateType.SILVER);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.settleAffiliateBalance(1);

        //Test
        assertEquals(0.0, adPlatform.getAffiliatesDatabase().get(1).getBalance(), 0.01);
    }

    @Test
    public void settlingGoldAffiliate(){
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setBalance(600.00);
        affiliate.setCumulativeBalance(600.00);
        affiliate.setType(AffiliateType.GOLD);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.settleAffiliateBalance(1);

        //Test
        assertEquals(0.0, adPlatform.getAffiliatesDatabase().get(1).getBalance(), 0.01);
    }


    @Test
    public void keywordFoundInServeAdvert(){
        //Setup
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("Video");
        keywords.add("VideoGame");
        keywords.add("");
        AdFormat adFormat = new AdFormat(MediaType.IMAGE,Dimensions.LARGE, "Video");
        AdDescription adDescription = new AdDescription(keywords, MediaType.IMAGE, Dimensions.LARGE);
        Advert advert = new Advert(1,"name", adDescription);
        adPlatform.registerAdvert(advert);

        // Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adFormat);

        // Test
        assertEquals(advert, returnedAdvert);
    }

    @Test
    public void keywordNotFoundInServeAdvert(){
        //Setup
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("Video");
        keywords.add("Doctor");
        keywords.add("");
        AdFormat adFormat = new AdFormat(MediaType.IMAGE,Dimensions.LARGE, "anime");
        AdDescription adDescription = new AdDescription(keywords, MediaType.IMAGE,Dimensions.LARGE);
        Advert advert = new Advert(1,"name", adDescription);
        adPlatform.registerAdvert(advert);

        // Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adFormat);

        // Test
        assertThat(returnedAdvert, is(not(advert)));
    }

    @Test
    public void AdMediaTypeMismatchInServeAdvert(){
        //Setup
        AdFormat adFormat = new AdFormat(MediaType.VIDEO,null,null);
        AdDescription adDesc = new AdDescription(new ArrayList<String>(), MediaType.IMAGE, null);
        Advert advert = new Advert(1,"Hello", adDesc);
        adPlatform.registerAdvert(advert);

        //Exercise
        Advert returnedAdvert = adPlatform.serveAdvert(adFormat);

        // Test
        assertThat(advert, is(not(returnedAdvert)));
    }

    @Test
    public void adClickedChangeToSilver() {
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setCumulativeBalance(49.95);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.AdClicked(1);

        //Test
        assertEquals(AffiliateType.SILVER, adPlatform.getAffiliatesDatabase().get(1).getType());
    }

    @Test
    public void adClickedChangeToGold() {
        //Setup
        Affiliate affiliate = new Affiliate(1, "HelpMe", "123");
        affiliate.setCumulativeBalance(499.95);
        affiliate.setType(AffiliateType.SILVER);
        adPlatform.registerAffiliate(affiliate);

        //Exercise
        adPlatform.AdClicked(1);

        //Test
        assertEquals(AffiliateType.GOLD, adPlatform.getAffiliatesDatabase().get(1).getType());
    }

}