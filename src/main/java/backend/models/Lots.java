package backend.models;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Lots {
    User findByTitle(String title);
    // get a list of all the ads
    List<Lot> all();
    // insert a new ad and return the new ad's id

    static Lot insert(String Title, String Description, String Street_number,
                      String Street_name, String Username, String Email,
                      String Appraisal, String Sale_price, String City,
                      String State, String Gov_org,
                      Connection Connection) throws SQLException {
        return null;
    }
}
