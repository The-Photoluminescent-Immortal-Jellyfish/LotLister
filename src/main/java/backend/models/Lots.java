package backend.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static backend.models.MySqlLotsDao.connection;

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
    static void insert(Lot lot) throws SQLException {
    }


    static ArrayList<Lot> all() throws SQLException {

        ArrayList<Lot> newLots = null;
        try {
            PreparedStatement sqlScript = connection.prepareStatement("SELECT * FROM lots_db.LOTS;");
            ResultSet rs = sqlScript.executeQuery();
            int count = 0;
            newLots = new ArrayList<>();
            while (rs.next()) {
                Lot thisLot = new Lot();
                thisLot.setTitle(rs.getString("title"));
                thisLot.setId(rs.getInt("id_lots"));
                thisLot.setStreet_number(rs.getString("street_number"));
                thisLot.setUsername(rs.getString("username"));

                thisLot.setStreet_name(rs.getString("street_name"));
                thisLot.setEmail(rs.getString("email"));
                thisLot.setAppraisal(String.valueOf(rs.getFloat("appraisal")));
                thisLot.setSale_price(rs.getString("sale_price"));

                thisLot.setCity(rs.getString("city"));
                thisLot.setState(rs.getString("state"));
                thisLot.setGov_org(rs.getString("gov_org"));
                thisLot.setDescription(rs.getString("description"));
                newLots.set(count, thisLot);
                count++;

            }
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
        return newLots;
    }
}