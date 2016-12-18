package cps3222.classes;

/**
 * Created by Euro Ryan on 25/11/2016.
 */
public interface PaymentProvider {
    boolean makePayment(int affiliateID, String bankAccount, Double amount);
}
