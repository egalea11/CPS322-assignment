package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Etienne G on 14/12/2016.
 */
@WebServlet(name = "AdvertServlet", urlPatterns = "/advert")
public class AdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String advertKeyword = request.getParameter("keyword");
        System.out.println(advertKeyword);

        request.getSession().setAttribute("keyword", advertKeyword);
        response.sendRedirect("accountadmin.jsp");
    }
}
