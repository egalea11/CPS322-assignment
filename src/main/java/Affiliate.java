/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class Affiliate {
    private int id;
    private String name;
    private AffiliateType type;
    private double balance;

    // Constructor
    public Affiliate(String name, int id) {
        this.name = name;
        this.type = AffiliateType.BRONZE;
        this.balance = 0;
        this.id = id;
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
}
