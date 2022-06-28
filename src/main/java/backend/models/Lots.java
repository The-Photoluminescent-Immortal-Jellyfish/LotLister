package backend.models;

import java.util.ArrayList;

public interface Lots {
    //    Lot findByTitle(String title);
    // get a list of all the ads
    // insert a new ad and return the new ad's id
    //    static Lot insert(String Title, String Description, String Street_number,
//                      String Street_name, String Username, String Email,
//                      String Appraisal, String Sale_price, String City,
//                      String State, String Gov_org,
//                      Connection Connection) throws SQLException {
//        return null;
//    }
    void insert(Lot lot);


    static ArrayList<Lot> all() {
    }
}