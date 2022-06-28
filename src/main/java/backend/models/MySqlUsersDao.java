package backend.models;


import backend.tools.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUsersDao implements Users {

    private Connection connection = null;

    public MySqlUsersDao() throws SQLException {

        Config config = new Config();

        DriverManager.registerDriver(new Driver());
         connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );

    }


//    @Override
//    public User findByUsername(String username) {
//
//        return null;
//    }

    @Override
    public void insert(User user) {

        try{
        PreparedStatement useDb = connection.prepareStatement("USE lots_db;");
        PreparedStatement sqlScript = connection.prepareStatement(
                "INSERT INTO lots_db.USERS (username, email, password) values(?, ?, ?);");

        assert useDb != null;
        assert sqlScript != null;

        sqlScript.setString(1, user.getUsername());
        sqlScript.setString(2, user.getEmail());
        sqlScript.setString(3, user.getPassword());

        useDb.execute();
        sqlScript.executeUpdate();
} catch (SQLException e){
            System.out.println("error = " + e);}
    }
}

//    private void createUser(User user) throws SQLException {


//    private void createUser(String username, String email, String password, Connection connection) {
//    }

//    public static void createUser(String username, String email, String password, Connection connection) throws SQLException {
//        PreparedStatement sqlScript = connection.prepareStatement(
//                "INSERT INTO lots_db.USERS (username, email, password) values(?, ?, ?);");
//
//
//        assert sqlScript != null;
//
//        sqlScript.setString(1, username);
//        sqlScript.setString(2, email);
//        sqlScript.setString(3, password);
//
//        sqlScript.execute();
//        sqlScript.executeUpdate();
//    }

