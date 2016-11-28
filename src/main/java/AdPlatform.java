import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class AdPlatform implements PaymentProvider{


    // Change from collection to use of HashMap
    private HashMap<Integer, Affiliate> affiliatesDatabase;
    private HashMap<Integer, Advert> advertDatabase;


    // Create new Affiliate
    public boolean registerAffiliate(Affiliate affiliate){
        affiliatesDatabase.put(affiliate.getId(), affiliate);
        return true;
    }

    // Settle Affiliate Balance
    public boolean settleAffiliateBalance(Affiliate affiliate){
        if (affiliate.getBalance() < 5.0){
            if(affiliate.getType() == AffiliateType.BRONZE){
                makePayment("AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 10)/ 100)); // adProvider payment
                makePayment("AdPlatformAccount",(affiliate.getBalance() * 10)/ 100);    // commission
                affiliate.setBalance(0.0);
            }
            else if(affiliate.getType() == AffiliateType.SILVER){
                makePayment("AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 10)/ 100)); // adProvider payment
                makePayment("AdPlatformAccount",(affiliate.getBalance() * 7.5)/ 100);   // commission
                affiliate.setBalance(0.0);
            }
            else if(affiliate.getType() == AffiliateType.GOLD){
                makePayment("AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 10)/ 100)); // adProvider payment
                makePayment("AdPlatformAccount",(affiliate.getBalance() * 5)/ 100);     // commission
                affiliate.setBalance(0.0);
            }
            affiliate.setType(AffiliateType.BRONZE);
            return true;
        }
        else{
            return false;
        }
    }

    // Serve an advert according to the description provided by an affiliate
    public Advert serveAdvert(AdDescription adDescription){
        ArrayList<Advert> potentialAdverts = new ArrayList<Advert>();

        // Get a list of potential adverts with matching keywords and format
        for(Advert advert: advertDatabase.values()){
            if (advert.getAdFormat().getMediaType() != adDescription.getFormat().getMediaType()){
                continue;
            }
            String keywordRequest = advert.getAdFormat().getKeywords();
            ArrayList<String> keywordList = adDescription.getKeywords();
            for(int i = 0; i < keywordList.size(); i++){
                if(keywordRequest.equals(keywordList.get(i))){
                    potentialAdverts.add(advert);
                    break;
                }
            }
        }

        // Choose one advert randomly from a list of adverts
        Random random = new Random();
        return potentialAdverts.get(random.nextInt(potentialAdverts.size()));
    }

    // Increase affiliate's balance and change type if needed.
    public void AdClicked (int affiliateID){
        Affiliate affiliate = affiliatesDatabase.get(affiliateID);
        affiliate.setBalance(affiliate.getBalance() + 0.5);
        if(affiliate.getType() == AffiliateType.BRONZE && affiliate.getBalance() > 50.0){
            affiliate.setType(AffiliateType.SILVER);
        }
        else if(affiliate.getType() == AffiliateType.SILVER && affiliate.getBalance() > 500.0){
            affiliate.setType(AffiliateType.GOLD);
        }
    }


    public boolean makePayment(String bankAccount, Double amount) {
        return false;
    }
}
