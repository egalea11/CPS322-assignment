import java.util.Collection;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class AdPlatform implements PaymentProvider{

    private Collection <Affiliate> affiliates;
    private Collection <AdProvider> adProviders;

    public Collection<Affiliate> getAffiliates() {
        return affiliates;
    }

    public void setAffiliates(Collection<Affiliate> affiliates) {
        this.affiliates = affiliates;
    }

    public Collection<AdProvider> getAdProviders() {
        return adProviders;
    }

    public void setAdProviders(Collection<AdProvider> adProviders) {
        this.adProviders = adProviders;
    }

    public boolean registerAffiliate(Affiliate affiliater){
        return true;
    }

    public boolean settleAffiliateBalance(Affiliate affiliate){
        return true;
    }

    public boolean serveAdvert(AdDescription adDescription){
        return true;
    }

    public void AdClicked (int affiliateID){

    }

    public boolean makePayment(String bankAccount, Double amount) {
        return false;
    }
}
