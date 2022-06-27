package backend.models;

import backend.tools.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {


    private static Users usersDao;
//    private static Ads adsDao;
//    private static Lots lotsDao;


    public static Users getUsersDao() throws SQLException {
        if (usersDao == null) {
            usersDao = new MySqlUsersDao();
        }
        return usersDao;
    }
}