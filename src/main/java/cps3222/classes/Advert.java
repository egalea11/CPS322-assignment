package cps3222.classes;

/**
 * Created by Euro Ryan on 25/11/2016.
 */

public class Advert{
    private int id;
    private String name;
    private AdDescription adDescription;

    //Constructor
    public Advert(int id, String name, AdDescription adDescription) {
        this.id = id;
        this.name = name;
        this.adDescription = adDescription;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdDescription getAdDescription() {
        return adDescription;
    }

    public void setAdDescription(AdDescription adDescription) {
        this.adDescription = adDescription;
    }
}
