package cps3222.classes;

/**
 * Created by Euro Ryan on 25/11/2016.
 */
public class AdFormat {
    private MediaType mediaType;
    private Dimensions dimensions;
    private String keywords;

    public AdFormat(MediaType mediaType, Dimensions dimensions, String keywords) {
        this.mediaType = mediaType;
        this.dimensions = dimensions;
        this.keywords = keywords;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
