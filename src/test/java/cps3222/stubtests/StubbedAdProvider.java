package cps3222.stubtests;

import cps3222.classes.*;

import java.util.ArrayList;

/**
 * Created by SterlingRyan on 12/27/2016.
 */
public class StubbedAdProvider implements AdProvider{
    public Advert serveAdvert(AdFormat adFormat) {
        return new Advert(1,"Hello",new AdDescription(new ArrayList<String>(), MediaType.IMAGE,Dimensions.LARGE));
    }
}
