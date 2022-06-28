package backend.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static backend.tools.Connection.makeConnection;

public class MySqlLotsDao implements Lots {
    Connection connection = makeConnection();

    public void MySqlUsersDao() throws SQLException {
    }

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


    @Override
    public User findByTitle(String username) {
        return null;
    }

    @Override
    public Long insert(String username, String email, String password) {
        createUser(username, email, password, connection);
        return null;
    }

    private void createUser(String username, String email, String password, Connection connection) {
    }

    public static void create(String title, String description, String street_number,
                              String street_name, String username, String email,
                              String appraisal, String sale_price, String city,
                              String state, String gov_org,
                              Connection connection) throws SQLException {

//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.street_number = street_number;
//        this.street_name = street_name;
//        this.username = username;
//        this.email = email;
//        this.appraisal = appraisal;
//        this.sale_price = sale_price;
//        this.city = city;
//        this.state = state;
//        this.gov_org = gov_org;

        PreparedStatement sqlScript = connection.prepareStatement(
                "INSERT INTO lots_db.USERS (title, description, street_number, street_name, username, email, appraisal, sale_price, city, state, gov_org) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

        assert sqlScript != null;

        sqlScript.setString(1, title);
        sqlScript.setString(2, description);
        sqlScript.setString(3, street_number);
        sqlScript.setString(4, street_name);

        sqlScript.setString(5, username);
        sqlScript.setString(6, email);
        sqlScript.setString(7, appraisal);
        sqlScript.setString(8, sale_price);

        sqlScript.setString(9, city);
        sqlScript.setString(10, state);
        sqlScript.setString(11, gov_org);

        sqlScript.execute();
        sqlScript.executeUpdate();
    }

    @Override
    public List<Lot> all() {
        return null;
    }

    @Override
    public int insert(Lot ad) {
        return 0;
    }
}