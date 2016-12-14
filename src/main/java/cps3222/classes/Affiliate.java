package cps3222.classes;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class Affiliate {
    private int id;
    private String name;
    private String password;
    private AffiliateType type;
    private double balance;
    private double cumulativeBalance;
    private double trackedCommission;

    //TODO add commission gained


    // Constructor
    public Affiliate(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = AffiliateType.BRONZE;
        this.balance = 0;
        this.cumulativeBalance = 0;
        this.trackedCommission = 0.0;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AffiliateType getType() {
        return type;
    }

    public void setType(AffiliateType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCumulativeBalance() {
        return cumulativeBalance;
    }

    public void setCumulativeBalance(double cumulativeBalance) {
        this.cumulativeBalance = cumulativeBalance;
    }

    public double getTrackedCommission() {
        return trackedCommission;
    }

    public void setTrackedCommission(double trackedCommision) {
        this.trackedCommission = trackedCommision;
    }
}
