package backend.models;

import java.util.List;

public interface Lots {
    User findByTitle(String title);

    Long insert(String username, String email, String password);

    // get a list of all the ads
    List<Lot> all();
    // insert a new ad and return the new ad's id
    int insert(Lot ad);
}
