package cps3222.classes;

import java.util.ArrayList;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */

public class AdDescription {
    private ArrayList<String> keywords;
    private AdFormat format;

    public AdDescription(ArrayList<String> keywords, AdFormat format) {
        this.keywords = keywords;
        this.format = format;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public AdFormat getFormat() {
        return format;
    }

    public void setFormat(AdFormat format) {
        this.format = format;
    }
}
