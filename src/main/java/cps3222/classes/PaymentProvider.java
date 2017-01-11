package cps3222.classes;


public interface PaymentProvider {
    boolean makePayment(int affiliateID, String bankAccount, Double amount);
}
