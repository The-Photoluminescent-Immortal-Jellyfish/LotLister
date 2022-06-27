package backend.models;

import backend.tools.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUsersDao implements Users {
    Config config = new Config();
    Connection connection = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword()
    );

    public MySqlUsersDao() throws SQLException {
        this.config = config;
    }


    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(String username, String email, String password) {
        try{
        PreparedStatement sqlScript = null;
        PreparedStatement sqlScript2 = null;
        sqlScript = connection.prepareStatement("USE lots_db;");
        sqlScript2 = connection.prepareStatement("INSERT INTO lots_db.USERS (username, email, password) values(?, ?, ?);");

        assert sqlScript != null;
        assert sqlScript2 != null;

        sqlScript2.setString(1, username);
        sqlScript2.setString(2, email);
        sqlScript2.setString(3, password);

        sqlScript.execute();
        sqlScript2.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return null;
    }
}
