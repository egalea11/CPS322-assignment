package cps3222.stubtests;

import cps3222.classes.*;
import java.util.ArrayList;


public class StubbedAdProvider implements AdProvider{
    public Advert serveAdvert(AdFormat adFormat) {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("Video");
        keywords.add("VideoGame");
        keywords.add("");
        return new Advert(1,"Hello",new AdDescription(keywords, MediaType.IMAGE,Dimensions.LARGE));
    }
}
