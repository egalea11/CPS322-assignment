package cps3222.classes;

import org.junit.*;
import static org.junit.Assert.*;


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
        // exercise
        affiliate.setId(123456);

        // verify
        assertEquals(123456, affiliate.getId());
    }

    @Test
    public void getSetName() throws Exception {
        // exercise
        affiliate.setName("Jonah");

        // verify
        assertEquals("Jonah", affiliate.getName());
    }

    @Test
    public void getSetPassword() throws Exception {
        // exercise
        affiliate.setPassword("123");

        // verify
        assertEquals("123", affiliate.getPassword());
    }

    @Test
    public void getSetType() throws Exception {
        // exercise
        affiliate.setType(AffiliateType.GOLD);

        // verify
        assertEquals(AffiliateType.GOLD, affiliate.getType());
    }

    @Test
    public void getSetBalance() throws Exception {
        // exercise
        affiliate.setBalance(553.5);

        // verify
        assertEquals(553.5, affiliate.getBalance(), 0.01);
    }

    @Test
    public void getSetTrackedCommission() throws Exception {
        // exercise
        affiliate.setTrackedCommission(553.5);

        // verify
        assertEquals(553.5, affiliate.getTrackedCommission(), 0.01);
    }
}