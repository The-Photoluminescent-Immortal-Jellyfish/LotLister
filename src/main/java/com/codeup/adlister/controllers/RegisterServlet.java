package com.codeup.adlister.controllers;

import com.codeup.adlister.models.user;
import org.apache.taglibs.standard.extra.spath.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.stream.Stream;


@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String passcode = request.getParameter("password");
        String passwordConfirm = request.getParameter("confirm_password");
        String person = request.getParameter("username");
        String email = request.getParameter("email");

//            compare password and confirm_password
        if (passcode.equals(passwordConfirm)) {
            user newUser = new user(person, email, passcode);
            createNewUser();
        }
// ...

        }

    private void createNewUser() throws IOException {
        Path path = (Path) Paths.get("\"mysql.gitignore\"");
        StringBuilder sb = new StringBuilder();
        Stream<String> stream = null;
        stream = Files.lines((java.nio.file.Path) path);
        stream.forEach(s -> sb.append(s).append("\n"));
        String mysqlPass = sb.toString();
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root", mysqlPass);
            if (connection != null) {
                System.out.println("Connection established......");
                StringBuilder script = new StringBuilder("src/main/SqlScripts/newUser.sql") {
                    String query = script.toString();
                    Statement connectionStatement = connection.createStatement();
//       ===========================================  ISSUES  ===========================================
                    java.beans.Statement.executeUpdate();
                    ResultSet rs = (connectionStatement.ResultSet) connectionStatement.getGeneratedKeys();
                    if(query.next())

                    {
                        System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                    }
                };
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




//        if equals
//        then create data object using USER constructor

//        run prepared statement using a mysql script through a jdbc connection

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        boolean validAttempt = username.equals("admin") && password.equals("password");
//
//        if (validAttempt) {
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }