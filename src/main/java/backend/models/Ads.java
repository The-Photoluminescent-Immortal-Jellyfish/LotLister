package backend.models;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Lot> all();
    // insert a new ad and return the new ad's id
    int insert(Lot ad);
}
