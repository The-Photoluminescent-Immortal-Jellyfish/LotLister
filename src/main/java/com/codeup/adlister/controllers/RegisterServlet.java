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
import java.util.stream.Stream;


@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String password = request.getParameter("password");
            String passwordConfirm = request.getParameter("confirm_password");
            String username = request.getParameter("username");
            String email = request.getParameter("email");

//            compare password and confirm_password
        if (password.equals(passwordConfirm)) {
            user newUser = new user(username, email, password);
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
                    //Initialize the script runner
                    ScriptRunner sr = new ScriptRunner(connection);
                    //Creating a reader object
                    Reader reader = new BufferedReader(new FileReader("E:\\sampleScript.sql"));
                    //Running the script
                    sr.runScript(reader);
                }
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
