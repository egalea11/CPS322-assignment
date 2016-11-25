/**
 * Created by Sterling Ryan on 25/11/2016.
 */
public interface AdProvider {

    void setName(String name);
    String getName();

    Advert serveAdvert(AdDescription adDescription);
}
