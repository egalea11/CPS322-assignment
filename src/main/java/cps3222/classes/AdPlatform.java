package cps3222.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class AdPlatform implements PaymentProvider, AdProvider{

    public AdPlatform(){
        initAffiliates();
    }

    // Change from collection to use of HashMap
    private HashMap<Integer, Affiliate> affiliatesDatabase = new HashMap<Integer, Affiliate>();
    private HashMap<Integer, Advert> advertDatabase = new HashMap<Integer, Advert>();

    public HashMap<Integer, Affiliate> getAffiliatesDatabase() {
        return affiliatesDatabase;
    }

    public void setAffiliatesDatabase(HashMap<Integer, Affiliate> affiliatesDatabase) {
        this.affiliatesDatabase = affiliatesDatabase;
    }

    public HashMap<Integer, Advert> getAdvertDatabase() {
        return advertDatabase;
    }

    public void setAdvertDatabase(HashMap<Integer, Advert> advertDatabase) {
        this.advertDatabase = advertDatabase;
    }

    // Create new Affiliate
    public boolean registerAffiliate(Affiliate affiliate){
        if(affiliatesDatabase.get(affiliate.getId()) != null){
            return false;
        }
        else{
            affiliatesDatabase.put(affiliate.getId(), affiliate);
            return true;
        }
    }

    // Create new Advert
    public boolean registerAdvert(Advert advert){
        if(advertDatabase.get(advert.getId()) != null){
            return false;
        }
        else{
            advertDatabase.put(advert.getId(), advert);
            return true;
        }
    }

    // Settle Balance
    public boolean settleAffiliateBalance(int affiliateID){
        Affiliate affiliate = affiliatesDatabase.get(affiliateID);
        if (affiliate.getBalance() >= 5.0){
            if(affiliate.getType() == AffiliateType.BRONZE){
                makePayment(affiliate.getId(),"AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 10)/ 100)); // adProvider payment
                makePayment(affiliate.getId(),"AdPlatformAccount",(affiliate.getBalance() * 10)/ 100);    // commission
                affiliate.setBalance(0.0);
            }
            else if(affiliate.getType() == AffiliateType.SILVER){
                makePayment(affiliate.getId(),"AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 7.5)/ 100)); // adProvider payment
                makePayment(affiliate.getId(),"AdPlatformAccount",(affiliate.getBalance() * 7.5)/ 100);   // commission
                affiliate.setBalance(0.0);
            }
            else if(affiliate.getType() == AffiliateType.GOLD){
                makePayment(affiliate.getId(),"AdProviderAccount",affiliate.getBalance() - ((affiliate.getBalance() * 5)/ 100)); // adProvider payment
                makePayment(affiliate.getId(),"AdPlatformAccount",(affiliate.getBalance() * 5)/ 100);     // commission
                affiliate.setBalance(0.0);
            }
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

        if(potentialAdverts.size() == 0){
            return null;
        }

        // Choose one advert randomly from a list of adverts
        Random random = new Random();
        return potentialAdverts.get(random.nextInt(potentialAdverts.size()));
    }

    // Increase affiliate's balance and change type if needed.
    public void AdClicked (int affiliateID){
        Affiliate affiliate = affiliatesDatabase.get(affiliateID);
        affiliate.setBalance(affiliate.getBalance() + 0.5);
        affiliate.setCumulativeBalance(affiliate.getCumulativeBalance() + 0.5);
        if(affiliate.getType() == AffiliateType.BRONZE && affiliate.getCumulativeBalance() >= 50.0){
            affiliate.setType(AffiliateType.SILVER);
        }
        else if(affiliate.getType() == AffiliateType.SILVER && affiliate.getCumulativeBalance() >= 500.0){
            affiliate.setType(AffiliateType.GOLD);
        }
    }

    public boolean makePayment(int affiliateID, String bankAccount, Double amount) {
        //TODO Track commision gained
        if(bankAccount.equals("AdProviderAccount")){
            return true;
        }
        return false;

    }

    //create sample affiliates
    public void initAffiliates(){
        Affiliate a1 = new Affiliate(111, "JohnDoe", "123");
        a1.setBalance(0);
        registerAffiliate(a1);
    }
}
