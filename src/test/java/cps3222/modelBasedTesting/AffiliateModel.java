package cps3222.modelBasedTesting;

import com.sun.corba.se.spi.orbutil.fsm.FSM;
import cps3222.classes.AdPlatform;
import cps3222.classes.Affiliate;
import cps3222.classes.AffiliateType;
import nz.ac.waikato.modeljunit.*;
import nz.ac.waikato.modeljunit.coverage.ActionCoverage;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionPairCoverage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by Sterling Ryan on 12/12/2016.
 */
public class AffiliateModel implements FsmModel {

    //Linking to the SUT
    private AdPlatform systemUnderTest = new AdPlatform();

    //State Variables
    private AffiliateState state = AffiliateState.BRONZE;
    private Boolean isAffiliateTypeBronze = true;
    private Boolean isAffiliateTypeSilver = false;
    private Boolean isAffiliateTypeGold = false;
    private Boolean isWithdrawable = false;

    //Test case
    private Affiliate affiliate = new Affiliate(1,"JetBrains.com", "123");

    // Method Implementations
    public Object getState() {
        return state;
    }

    public void reset(boolean b) {
        //Reset state variables
        isAffiliateTypeBronze = true;
        isAffiliateTypeSilver = false;
        isAffiliateTypeGold = false;
        isWithdrawable = false;

        if(b){
            systemUnderTest = new AdPlatform();
            affiliate.setCumulativeBalance(0.0);
            affiliate.setBalance(0.0);
            affiliate.setType(AffiliateType.BRONZE);
            systemUnderTest.registerAffiliate(affiliate);
        }
        state = AffiliateState.BRONZE;
    }

    //Transitions inc. guards
    public boolean changeTypetoSilverGuard(){
        return getState().equals(AffiliateState.BRONZE);
    }
    public @Action void changeTypetoSilver(){

        //Updating Sut
        systemUnderTest.getAffiliatesDatabase().get(1).setBalance(0.0);
        systemUnderTest.getAffiliatesDatabase().get(1).setCumulativeBalance(49.5);
        systemUnderTest.AdClicked(1);

        //Updating model
        state = AffiliateState.SILVER;
        isAffiliateTypeBronze = false;
        isAffiliateTypeSilver = true;
        isWithdrawable = false;


        //Checking Correspondence
        Assert.assertEquals("SUT is withdrawable while model is in state SILVER", true ,systemUnderTest.getAffiliatesDatabase().get(1).getBalance() < 5.0);
        Assert.assertEquals("SUT's affiliate is not of type SILVER while model is in state SILVER", isAffiliateTypeSilver ,systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.SILVER);
    }

    public boolean changeTypetoWithdrawableSilverGuard(){
        return getState().equals(AffiliateState.WITHDRAWABLE_BRONZE);
    }
    public @Action void changeTypetoWithdrawableSilver(){

        //Updating Sut
        if (systemUnderTest.getAffiliatesDatabase().get(1).getCumulativeBalance() < 50.00) {
            double remainingBalance = (50.00 - systemUnderTest.getAffiliatesDatabase().get(1).getCumulativeBalance()) / 0.5;
            for(int i = 0; i < remainingBalance; i++){
                systemUnderTest.AdClicked(1);
            }
        }

        //Updating model
        state = AffiliateState.WITHDRAWABLE_SILVER;
        isAffiliateTypeBronze = false;
        isAffiliateTypeSilver = true;


        //Checking Correspondence
        Assert.assertEquals("The SILVER model state does not match with the System under test", isAffiliateTypeSilver,systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.SILVER);
    }

    public boolean changeTypetoWithdrawableSilverFromBronzeGuard(){
        return getState().equals(AffiliateState.BRONZE);
    }
    public @Action void changeTypetoWithdrawableSilverFromBronze(){

        //Updating Sut
        systemUnderTest.getAffiliatesDatabase().get(1).setBalance(4.5);
        systemUnderTest.getAffiliatesDatabase().get(1).setCumulativeBalance(49.5);
        systemUnderTest.AdClicked(1);

        //Updating model
        state = AffiliateState.WITHDRAWABLE_SILVER;
        isAffiliateTypeBronze = false;
        isAffiliateTypeSilver = true;
        isWithdrawable = true;


        //Checking Correspondence
        Assert.assertEquals("The SILVER model state does not match with the System under test", isAffiliateTypeSilver,systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.SILVER);
        Assert.assertEquals("SUT's affiliate is not withdrawable contrary to the Model", true,systemUnderTest.getAffiliatesDatabase().get(1).getBalance() >= 5.0);
    }

    public boolean changeTypetoGoldGuard(){
        return getState().equals(AffiliateState.SILVER);
    }
    public @Action void changeTypetoGold(){

        //Updating Sut
        systemUnderTest.getAffiliatesDatabase().get(1).setBalance(0.0);
        systemUnderTest.getAffiliatesDatabase().get(1).setCumulativeBalance(499.5);
        systemUnderTest.AdClicked(1);

        //Updating model
        state = AffiliateState.GOLD;
        isAffiliateTypeGold = true;
        isAffiliateTypeSilver = false;
        isWithdrawable = false;


        //Checking Correspondence
        Assert.assertEquals("SUT is withdrawable while model is in state GOLD", true ,systemUnderTest.getAffiliatesDatabase().get(1).getBalance() < 5.0);
        Assert.assertEquals("SUT's affiliate is not of type GOLD while model is in state GOLD", isAffiliateTypeGold ,systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.GOLD);
    }

    public boolean changeTypetoWithdrawableGoldGuard(){return getState().equals(AffiliateState.WITHDRAWABLE_SILVER);}
    public @Action void changeTypetoWithdrawableGold(){

        //Updating Sut
        if (systemUnderTest.getAffiliatesDatabase().get(1).getCumulativeBalance() < 500.00) {
            double remainingBalance = (500.00 - systemUnderTest.getAffiliatesDatabase().get(1).getCumulativeBalance()) / 0.5;
            for(int i = 0; i < remainingBalance; i++){
                systemUnderTest.AdClicked(1);
            }
        }


        //Updating model
        state = AffiliateState.WITHDRAWABLE_GOLD;
        isAffiliateTypeSilver = false;
        isAffiliateTypeGold = true;

        //Checking Correspondence
        Assert.assertEquals("The GOLD model state does not match with the System under test", isAffiliateTypeGold,systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.GOLD);
    }

    public boolean changeTypetoWithdrawableGoldFromSilverGuard(){
        return getState().equals(AffiliateState.SILVER);
    }
    public @Action void changeTypetoWithdrawableGoldFromSilver() {

        //Updating Sut
        systemUnderTest.getAffiliatesDatabase().get(1).setBalance(4.5);
        systemUnderTest.getAffiliatesDatabase().get(1).setCumulativeBalance(499.5);
        systemUnderTest.AdClicked(1);

        //Updating model
        state = AffiliateState.WITHDRAWABLE_GOLD;
        isAffiliateTypeSilver = false;
        isAffiliateTypeGold = true;
        isWithdrawable = true;


        //Checking Correspondence
        Assert.assertEquals("The GOLD model state does not match with the System under test", isAffiliateTypeGold, systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.GOLD);
        Assert.assertEquals("SUT's affiliate is not withdrawable contrary to the Model", true, systemUnderTest.getAffiliatesDatabase().get(1).getBalance() >= 5.0);
    }

    public boolean increaseBalanceGuard(){return getState().equals(AffiliateState.BRONZE) || getState().equals(AffiliateState.SILVER) || getState().equals(AffiliateState.GOLD);}
    public @Action void increaseBalance(){
        //Initial insertion
        systemUnderTest.registerAffiliate(affiliate);

        //Update SUT
        if(getState().equals(AffiliateState.BRONZE) || getState().equals(AffiliateState.SILVER) || getState().equals(AffiliateState.GOLD) ){
            double remainingBalance = (5.00 - systemUnderTest.getAffiliatesDatabase().get(1).getBalance())/ 0.5;
            for(int i = 0; i <remainingBalance; i++){
                systemUnderTest.AdClicked(1);
            }
        }

        //Updating model
        if(getState().equals(AffiliateState.BRONZE)){
            state = AffiliateState.WITHDRAWABLE_BRONZE;
        }
        else if(getState().equals(AffiliateState.SILVER)){
            state = AffiliateState.WITHDRAWABLE_SILVER;
        }
        else if(getState().equals(AffiliateState.GOLD)){
            state = AffiliateState.WITHDRAWABLE_GOLD;
        }
        isWithdrawable = true;

        //Checking Correspondence
        if(getState().equals(AffiliateState.WITHDRAWABLE_BRONZE)){
            Assert.assertEquals("The withdrawable bronze model state does not match the system in test : " + systemUnderTest.getAffiliatesDatabase().get(1).getType(),
                    true,
                    systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.BRONZE);
        }
        else if(getState().equals(AffiliateState.WITHDRAWABLE_SILVER)){
            Assert.assertEquals("The withdrawable silver model state does not match the system in test",
                    true,
                    systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.SILVER);
        }
        else if(getState().equals(AffiliateState.WITHDRAWABLE_GOLD)){
            Assert.assertEquals("The withdrawable gold model state does not match the system in test",
                    true,
                    systemUnderTest.getAffiliatesDatabase().get(1).getType() == AffiliateType.GOLD);
        }
    }

    public boolean withdrawGuard(){return getState().equals(AffiliateState.WITHDRAWABLE_BRONZE) || getState().equals(AffiliateState.WITHDRAWABLE_SILVER) || getState().equals(AffiliateState.WITHDRAWABLE_GOLD);}
    public @Action void withdraw(){
        //Update SUT
        systemUnderTest.settleAffiliateBalance(affiliate.getId());


        //Update Model
        if(getState().equals(AffiliateState.WITHDRAWABLE_BRONZE)){
            state = AffiliateState.BRONZE;
        }
        else if(getState().equals(AffiliateState.WITHDRAWABLE_SILVER)){
            state = AffiliateState.SILVER;
        }
        else if(getState().equals(AffiliateState.WITHDRAWABLE_GOLD)){
            state = AffiliateState.GOLD;
        }
        isWithdrawable = false;

        //Checking Correspondence
        if(getState().equals(AffiliateState.BRONZE)){
            Assert.assertEquals("Withdraw testing does not match System under test : " + affiliate.getType() + " Balance : " + affiliate.getBalance() + " Cumulative : " +  affiliate.getCumulativeBalance(),
                    true,
                    (affiliate.getBalance() == 0.0)
                            && (affiliate.getType() == AffiliateType.BRONZE)
                            && (affiliate.getCumulativeBalance() >= 0.0));
        }
        else if(getState().equals(AffiliateState.SILVER)){
            Assert.assertEquals("Withdraw testing does not match System under test : " + affiliate.getType() + " Balance : " + affiliate.getBalance() + " Cumulative : " +  affiliate.getCumulativeBalance(),
                    true,
                    (affiliate.getBalance() == 0.0)
                            && (affiliate.getType() == AffiliateType.SILVER)
                            && (affiliate.getCumulativeBalance() >= 50.0));
        }
        else if(getState().equals(AffiliateState.GOLD)){
            Assert.assertEquals("Withdraw testing does not match System under test :" + affiliate.getType() + " Balance : " + affiliate.getBalance() + " Cumulative : " +  affiliate.getCumulativeBalance(),
                    true,
                    (affiliate.getBalance() == 0.0)
                            && (affiliate.getType() == AffiliateType.GOLD)
                            && (affiliate.getCumulativeBalance() >= 500.0));
        }
    }



    @Test
    public void main() {
        LookaheadTester tester = new LookaheadTester(new AffiliateModel());
        //tester.setResetProbability(0.01); // long test sequences
        tester.setRandom(new Random());
        tester.buildGraph();
        tester.addListener(new StopOnFailureListener());
        tester.addListener("verbose");
        tester.addCoverageMetric(new TransitionPairCoverage());
        tester.addCoverageMetric(new StateCoverage());
        tester.addCoverageMetric(new ActionCoverage());
        tester.generate(9);
        tester.printCoverage();
    }
}

