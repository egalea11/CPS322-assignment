package cps3222.stubtests;

import cps3222.classes.PaymentProvider;


public class StubbedPaymentProvider implements PaymentProvider {
    public boolean makePayment(int affiliateID, String bankAccount, Double amount) {
        return true;
    }
}
