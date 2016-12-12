package cps3222.modelBasedTesting;

import com.sun.corba.se.spi.orbutil.fsm.FSM;
import cps3222.classes.AdPlatform;
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

/**
 * Created by Sterling Ryan on 12/12/2016.
 */
public class AffiliateModel implements FsmModel {

    //Linking to the SUT
    private AdPlatform systemUnderTest = new AdPlatform();

    //State Variables
    private AffiliateState state = AffiliateState.BRONZE;
    private double balance = 0.0;
    private String cumulativeBalance = "<50";
    private boolean bronze = true, silver = false, gold = false;

    // Method Implementations
    public Object getState() {
        return state;
    }

    public void reset(boolean b) {
        if(b){
            systemUnderTest = new AdPlatform();
        }
        state = AffiliateState.BRONZE;
    }

    //Transitions inc. guards
    public boolean changeTypetoSilverGuard(){
        return getState().equals(AffiliateState.BRONZE);
    }

    public @Action void changeTypetoSilver(){

    }
}

