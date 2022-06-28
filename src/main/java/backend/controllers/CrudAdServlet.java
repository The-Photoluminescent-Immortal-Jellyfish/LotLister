package backend.controllers;

import com.mysql.cj.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//      make a servlet that receives CRUD requests from various forms,
//      runs associated subprograms,
//      to interact with DB,
//      and show verification of success or failure
//      and redirect url to appropriate page
//      decouple methods to create new classes when necessary
@WebServlet(name = "controllers.CrudAdServlet", urlPatterns = "/crudad")
public class CrudAdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String street_number = request.getParameter("street_number");
        String street_name = request.getParameter("street_name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String appraisal = request.getParameter("appraisal");
        String sale_price = request.getParameter("sale_price");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String gov_org = request.getParameter("gov_org");




//            compare password and confirm_password
            try {
                DriverManager.registerDriver(new Driver());
                Connection connection = null;
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
                        "root",
                        "password"
                );
                PreparedStatement sqlScript = null;
                PreparedStatement sqlScript2 = null;
                sqlScript = connection.prepareStatement("USE lots_db;");
                sqlScript2 = connection.prepareStatement("INSERT INTO lots_db.LOTS " +
                        "(title, description, street_number, street_name, username, email, appraisal, sale_price, city, state, gov_org) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

                assert sqlScript != null;
                assert sqlScript2 != null;


//                String title = request.getParameter("title");
//                String description = request.getParameter("description");
//                String street_number = request.getParameter("street_number");
//                String street_name = request.getParameter("street_name");
//                String username = request.getParameter("username");
//                String email = request.getParameter("email");
//                String appraisal = request.getParameter("appraisal");
//                String sale_price = request.getParameter("sale_price");
//                String listing_name = request.getParameter("listing_name");
//                String city = request.getParameter("city");
//                String state = request.getParameter("state");
//                String gov_org = request.getParameter("gov_org");
                sqlScript2.setString(1, title);
                sqlScript2.setString(2, description);
                sqlScript2.setString(3, street_number);
                sqlScript2.setString(4, street_name);
                sqlScript2.setString(5, username);
                sqlScript2.setString(6, email);
                sqlScript2.setString(7, appraisal);
                sqlScript2.setString(8, sale_price);
                sqlScript2.setString(9, city);
                sqlScript2.setString(10, state);
                sqlScript2.setString(11, gov_org);


                sqlScript.execute();
                sqlScript2.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/crudad.jsp").forward(request, response);
    }
}