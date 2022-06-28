package backend.models;


import backend.tools.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

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
//package com.codeup.adlister.dao;
//
//        import com.codeup.adlister.models.User;
//        import com.mysql.cj.jdbc.Driver;
//
//        import java.sql.*;
//
//public class MySQLUsersDao implements Users {
//    private Connection connection;
//
//    public MySQLUsersDao(Config config) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database!", e);
//        }
//    }
//
//
//    @Override
//    public User findByUsername(String username) {
//        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setString(1, username);
//            return extractUser(stmt.executeQuery());
//        } catch (SQLException e) {
//            throw new RuntimeException("Error finding a user by username", e);
//        }
//    }
//
//    @Override
//    public Long insert(User user) {
//        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//            stmt.setString(1, user.getUsername());
//            stmt.setString(2, user.getEmail());
//            stmt.setString(3, user.getPassword());
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating new user", e);
//        }
//    }
//
//    private User extractUser(ResultSet rs) throws SQLException {
//        if (! rs.next()) {
//            return null;
//        }
//        return new User(
//                rs.getLong("id"),
//                rs.getString("username"),
//                rs.getString("email"),
//                rs.getString("password")
//        );
//    }
//
//}