package backend.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SqlToStatement {

    public static void main(String[] args) throws IOException {

    }
//    make method to convert String to filepath and execute a prepared statement from the various sql
//    statements in the project library
    public static void sqlToStatement(String path) throws IOException, SQLException {
//      use path to create a path object that works with readString()
        Path filepath = Paths.get(path);
//        assign the text from a file object to a string using the contents of the selected filepath
        String sqlString = Files.readString(filepath);
//        create a new db connection object to make a prepared statement
        Connection connection = null;
//        make the db connection
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "password"
        );
//        prepare the statement from the String that was created using the appropriate filepath
        PreparedStatement statment = connection.prepareStatement(sqlString);
//        execute sql statement
        statment.execute();
    }
}