package backend.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static backend.tools.Connection.makeConnection;

public class MySqlLotsDao implements Lots {
    static Connection connection = makeConnection();
//    title description street_number street_name username email appraisal sale_price listing_name city state gov_org

//    this.id = id;
//        this.title = title;
//        this.description = description;
//        this.street_number = street_number;
//        this.street_name = street_name;
//        this.username = username;
//        this.email = email;
//        this.appraisal = appraisal;
//        this.sale_price = sale_price;
//        this.listing_name = listing_name;
//        this.city = city;
//        this.state = state;
//        this.gov_org = gov_org;

    public MySqlLotsDao() throws SQLException {
    }

    public static void insert(Lot newLot) throws SQLException {

        PreparedStatement useDb = connection.prepareStatement("USE lots_db;");
        PreparedStatement sqlScript = connection.prepareStatement(
                "INSERT INTO lots_db.LOTS (title, description, street_number, street_name, username, email, appraisal, sale_price, city, state, gov_org) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

        assert useDb != null;
        assert sqlScript != null;

        sqlScript.setString(1, newLot.getTitle());
        sqlScript.setString(2, newLot.getDescription());
        sqlScript.setString(3, newLot.getStreet_number());
        sqlScript.setString(4, newLot.getStreet_name());

        sqlScript.setString(5, newLot.getUsername());
        sqlScript.setString(6, newLot.getEmail());
        sqlScript.setString(7, newLot.getAppraisal());
        sqlScript.setString(8, newLot.getSale_price());

        sqlScript.setString(9, newLot.getCity());
        sqlScript.setString(10, newLot.getState());
        sqlScript.setString(11, newLot.getGov_org());

        useDb.execute();
        sqlScript.executeUpdate();
    }

    @Override
    public User findByTitle(String username) {
        return null;
    }

    @Override
    public List<Lot> all() {
        Connection Connection = makeConnection();
//        PreparedStatement sqlScript = connection.prepareStatement(
        return null;
    }
}