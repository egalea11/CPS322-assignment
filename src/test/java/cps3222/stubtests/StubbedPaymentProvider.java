package cps3222.stubtests;

import cps3222.classes.PaymentProvider;

/**
 * Created by SterlingRyan on 12/27/2016.
 */
public class StubbedPaymentProvider implements PaymentProvider {
    public boolean makePayment(int affiliateID, String bankAccount, Double amount) {
        return true;
    }
}
