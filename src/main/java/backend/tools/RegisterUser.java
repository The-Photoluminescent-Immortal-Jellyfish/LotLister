//package backend.tools;
////        get register form data from register.jsp
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import backend.models.MySqlUsersDao;
//import com.mysql.cj.jdbc.Driver;
//public class RegisterUser extends HttpServlet {
//    public static void main(String[] args) {
//    }
//
//    public static void registerUser(HttpServletRequest request, HttpServletResponse response) throws ClassCastException {
//            String passcode = request.getParameter("password");
//            String passwordConfirm = request.getParameter("confirm_password");
//            String person = request.getParameter("username");
//            String mail = request.getParameter("email");
////            compare password and confirm_password
//            if (passcode.equals(passwordConfirm)) {
//                try {
//                    DriverManager.registerDriver(new Driver());
//                    Connection connection = null;
//                    connection = DriverManager.getConnection(
//                            "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
//                            "root",
//                            "password"
//                    );
//                    MySqlUsersDao.createUser(person, mail, passcode, connection);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }