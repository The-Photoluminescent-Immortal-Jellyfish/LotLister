package backend.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//      make a servlet that receives CRUD requests from various forms,
//      runs associated subprograms,
//      to interact with DB,
//      and show verification of success or failure
//      and redirect url to appropriate page
//      decouple methods to create new classes when necessary
@WebServlet(name = "controllers.CrudAdServlet", urlPatterns = "/crudad")
public class CrudAdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/crudad.jsp").forward(request, response);
    }
}