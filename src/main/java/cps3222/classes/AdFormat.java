package cps3222.classes;


public class AdFormat {
    private MediaType mediaType;
    private Dimensions dimensions;
    private String keyword;

    public AdFormat(MediaType mediaType, Dimensions dimensions, String keyword) {
        this.mediaType = mediaType;
        this.dimensions = dimensions;
        this.keyword = keyword;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keywords) {
        this.keyword = keywords;
    }
}
