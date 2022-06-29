package backend.models;

//import java.sql.*;
//import java.util.ArrayList;

//import static backend.tools.Connection.makeConnection;


import backend.tools.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class MySqlLotsDao implements Lots {
//    DriverManager.registerDriver(new Driver());

    public Connection connection = null;

    public MySqlLotsDao() throws SQLException {

        Config config = new Config();

        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );

    }
//    static Connection connection = makeConnection();
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


    public void insert(Lot newLot) {
        try {
        PreparedStatement useDb = connection.prepareStatement("USE lots_db;");
        PreparedStatement sqlScript = connection.prepareStatement(
                "INSERT INTO lots_db.LOTS (street_number, street_name, username, email, appraisal, sale_price, city, state, gov_org, title, description) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

        assert useDb != null;
        assert sqlScript != null;


        sqlScript.setString(1, newLot.getStreet_number());
        sqlScript.setString(2, newLot.getStreet_name());

        sqlScript.setString(3, newLot.getUsername());
        sqlScript.setString(4, newLot.getEmail());
        sqlScript.setString(5, newLot.getAppraisal());
        sqlScript.setString(6, newLot.getSale_price());

        sqlScript.setString(7, newLot.getCity());
        sqlScript.setString(8, newLot.getState());
        sqlScript.setString(9, newLot.getGov_org());

        sqlScript.setString(10, newLot.getTitle());
        sqlScript.setString(11, newLot.getDescription());

        useDb.execute();
        sqlScript.executeUpdate();
    }
        catch (SQLException e) {
            System.out.println("error = " + e);}
        }

    @Override
    public ArrayList<Lot> all() {
        return null;
    }

//    @Override
//    public ArrayList<Lot> all() {
//        if (lots == null) {
//            lots = generateLots();
//        }
//        return lots;
//    }
}
//    @Override
//    public User findByTitle(String username) {
//        return null;
//    }