package com.codeup.adlister.controllers;


import com.codeup.adlister.models.user;
import com.mysql.cj.jdbc.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import org.apache.taglibs.standard.extra.spath.Path;

import java.lang.ScriptRunner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
// ...
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
                if(connection != null) {
                    System.out.println("Connection established......");
                    String query = "INSERT INTO USERS (username, email, password) VALUES('Nelly Furtado', 'Loose', 2006, 'Pop, Urban, R&B', 12.5)";
                    Statement stmt = connection.createStatement();
                    stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                    ResultSet rs = stmt.getGeneratedKeys();
                    if (rs.next()) {
                        System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                    }
                }

                }
            } catch (SQLException e) {
                e.printStackTrace();
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
}
