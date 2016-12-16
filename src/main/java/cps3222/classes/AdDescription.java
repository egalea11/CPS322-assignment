package cps3222.classes;

import java.util.ArrayList;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */

public class AdDescription {
    private ArrayList<String> keywords;
    private AdFormat format;

    public AdDescription(AdFormat format) {
        this.keywords = initList();
        this.format = format;
    }

    // initialization of sample array-list containing a list of keywords
    private ArrayList<String> initList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("gaming"); list.add("business");
        list.add("drama");  list.add("lights");
        list.add("action"); list.add("movies");
        list.add("love");   list.add("nature");
        list.add("food");   list.add("animals");
        list.add("music");  list.add("education");
        list.add("art");    list.add("mixed");
        list.add("sports"); list.add("government");
        return list;
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
