package com.codeup.adlister.controllers;

//import com.codeup.adlister.models.RegisterUser;
//import com.codeup.adlister.models.user;

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

import com.mysql.cj.jdbc.Driver;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    public static void registerUser(HttpServletRequest request) throws IOException, ClassCastException, SQLException {
//        Path path = (Path) Paths.get("/mysql.gitignore");
//        StringBuilder sb = new StringBuilder();
//        Stream<String> stream = null;
//        stream = Files.lines((java.nio.file.Path) path);
//        stream.forEach(s -> sb.append(s).append("\n"));
//        String mysqlPass = sb.toString();
//        try {
//            String nam = request.getParameter("username");
//            String mal = request.getParameter("email");
//            String pas = request.getParameter("password");
//            System.out.println("Connection established......");
//                StringBuilder script = new StringBuilder("src/main/SqlScripts/newUser.sql");
//                String query = script.toString();
//                PreparedStatement sqlScript = connection.prepareStatement(query);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        get register form data from register.jsp
        String passcode = request.getParameter("password");
        String passwordConfirm = request.getParameter("confirm_password");
        String person = request.getParameter("username");
        String mail = request.getParameter("email");
//            compare password and confirm_password
        if (passcode.equals(passwordConfirm)) {
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
                sqlScript2 = connection.prepareStatement("INSERT INTO lots_db.USERS (username, email, password) values(?, ?, ?);");

                assert sqlScript != null;
                assert sqlScript2 != null;

                sqlScript2.setString(1, person);
                sqlScript2.setString(2, mail);
                sqlScript2.setString(3, passcode);

                sqlScript.execute();
                sqlScript2.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
//       ===========================================  ISSUES  ===========================================

//        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
//    public void createNewUser(user thisUser) throws IOException {
//        Path path = (Path) Paths.get("\"mysql.gitignore\"");
//        StringBuilder sb = new StringBuilder();
//        Stream<String> stream = null;
//        stream = Files.lines((java.nio.file.Path) path);
//        stream.forEach(s -> sb.append(s).append("\n"));
//        String mysqlPass = sb.toString();
//        try {
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/lots_db?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root", mysqlPass);
//            if (connection != null) {
//                System.out.println("Connection established......");
////                StringBuilder script = new StringBuilder("src/main/SqlScripts/newUser.sql");
////                String query = script.toString();
////                PreparedStatement sqlScript = connection.prepareStatement(query);
//                PreparedStatement sqlScript = connection.prepareStatement("USE lots_db; INSERT INTO USERS (username, email, password) values(username, email, password);");
//                sqlScript.executeUpdate();
////       ===========================================  ISSUES  ===========================================
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }
}