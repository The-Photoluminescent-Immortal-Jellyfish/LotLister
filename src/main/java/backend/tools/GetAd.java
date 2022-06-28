//package backend.tools;
//
//
//import java.sql.DriverManager;
//
//import com.mysql.cj.Query;
//import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.PreparedQuery;
//
//import connectionStatement.ResultSet;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.beans.Statement;
//import java.sql.*;
//
//import com.mysql.cj.jdbc.Driver;
//
//public class GetAd {
//
//
//    public static void main(String[] args) {
//
//    }
////    getAd() adapted from oracle java documentation
////    https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
//    public void getAd() throws SQLException {
//        DriverManager.registerDriver(new Driver());
//        Connection connection = null;
//        connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
//                "root",
//                "password"
//        );
//        try (PreparedStatement stmt = connection.prepareStatement(""/*statement goes here*/)) {
//
//
////        String stmt2 = String.valueOf(connection.prepareCall(
////        "CREATE TABLE `USERS` (`username` varchar(45) NOT NULL ,`email`    varchar(45) NOT NULL ,`password` varchar(45) NOT NULL ,PRIMARY KEY (`username`, `email`));"));
//        ResultSet rs = (ResultSet) stmt.executeQuery();
//
//        while (((java.sql.ResultSet) rs).next()) {
////            get all the values and store them in variables
//
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    }
//}
