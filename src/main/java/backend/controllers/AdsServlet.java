package backend.controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


    package backend.controllers;

import backend.models.*;
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
import java.util.ArrayList;

import static backend.models.MySqlLotsDao.insert;

    //      make a servlet that receives CRUD requests from various forms,
//      runs associated subprograms,
//      to interact with DB,
//      and show verification of success or failure
//      and redirect url to appropriate page
//      decouple methods to create new classes when necessary
    @WebServlet(name = "controllers.AdsServlet", urlPatterns = "/ads")
    public class AdsServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            try {


                Lots lotsDao = DaoFactory.getLotsDao();
                ArrayList<Lot> lotsIndex = lotsDao.all();

                //send redirect to login after; <---

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            request.getRequestDispatcher("/WEB-INF/ads.jsp").forward(request, response);
        }
}
