package cps3222.classes;

/**
 * Created by Euro Ryan on 25/11/2016.
 */

public class Advert implements AdProvider {
    private int id;
    private String name;
    private AdFormat adFormat;

    //Constructor
    public Advert(int id, String name, AdFormat adFormat) {
        this.id = id;
        this.name = name;
        this.adFormat = adFormat;
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

    public AdFormat getAdFormat() {
        return adFormat;
    }

    public void setAdFormat(AdFormat adFormat) {
        this.adFormat = adFormat;
    }

    public Advert serveAdvert(AdDescription adDescription) {
        return null;
    }
}
