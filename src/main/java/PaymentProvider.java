/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public interface PaymentProvider {
    boolean makePayment(String bankAccount, Double amount);
}
