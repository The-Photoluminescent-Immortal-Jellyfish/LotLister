package backend.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static backend.tools.Connection.makeConnection;

public class MySqlUsersDao implements Users {
    Connection connection = makeConnection();

    public MySqlUsersDao() throws SQLException {
    }


    @Override
    public User findByUsername(String username) {

        return null;
    }

    @Override
    public void insert(User user) throws SQLException {

        createUser(user);
    }

    private void createUser(User user) throws SQLException {
        PreparedStatement sqlScript = connection.prepareStatement(
                "INSERT INTO lots_db.USERS (username, email, password) values(?, ?, ?);");


        assert sqlScript != null;

        sqlScript.setString(1, user.getUsername());
        sqlScript.setString(2, user.getEmail());
        sqlScript.setString(3, user.getPassword());

        sqlScript.execute();
        sqlScript.executeUpdate();
    }

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
}