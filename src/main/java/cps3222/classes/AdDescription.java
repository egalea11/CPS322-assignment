package cps3222.classes;

import java.util.ArrayList;

/**
 * Created by Euro Ryan on 25/11/2016.
 */

public class AdDescription {
    private ArrayList<String> keywords;
    private MediaType mediaType;
    private Dimensions dimensions;

    //Constructor
    public AdDescription(ArrayList<String> keywords, MediaType mediaType, Dimensions dimensions) {
        initList(); // init array list with sample keywords
        this.keywords = keywords;
        this.mediaType = mediaType;
        this.dimensions = dimensions;
    }

    // initialization of sample array-list containing a list of keywords
    public void initList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("gaming");
        list.add("business");
        list.add("sports");
        this.keywords = list;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> list) {
        for(String x: list) {
            this.keywords.add(x);
        }
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
