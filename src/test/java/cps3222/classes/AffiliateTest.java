package cps3222.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Etienne G on 02/12/2016.
 */
public class AffiliateTest {

    Affiliate affiliate;

    @Before
    public void setUp() throws Exception {
        affiliate = new Affiliate(0, null, null);
    }

    @After
    public void tearDown() throws Exception {
        affiliate = null;
    }

    @Test
    public void getSetId() throws Exception {
        affiliate.setId(123456);

        assertEquals(123456, affiliate.getId());
    }

    @Test
    public void getSetName() throws Exception {
        affiliate.setName("Jonah");

        assertEquals("Jonah", affiliate.getName());
    }

    @Test
    public void getSetPassword() throws Exception {
        affiliate.setPassword("123");

        assertEquals("123", affiliate.getPassword());
    }

    @Test
    public void getSetType() throws Exception {
        affiliate.setType(AffiliateType.GOLD);

        assertEquals(AffiliateType.GOLD, affiliate.getType());
    }

    @Test
    public void getSetBalance() throws Exception {
        affiliate.setBalance(553.5);

        assertEquals(553.5, affiliate.getBalance(), 0.01);
    }
}