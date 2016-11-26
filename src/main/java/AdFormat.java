import java.util.ArrayList;

/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public class AdFormat {
    private MediaType mediaType;
    private Dimensions dimensions;
    private String keywords;

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
