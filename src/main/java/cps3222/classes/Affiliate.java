package cps3222.classes;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class Affiliate {
    private int id;
    private String name;
    private AffiliateType type;
    private double balance;
    private double cumulativeBalance;

    //TODO add commission gained


    // Constructor
    public Affiliate(int id, String name) {
        this.id = id;
        this.name = name;
        this.type = AffiliateType.BRONZE;
        this.balance = 0;
        this.cumulativeBalance = 0;
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
}
