package servlets;

import cps3222.classes.AdPlatform;
import cps3222.classes.Affiliate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AdvertServlet", urlPatterns = "/adclick")
public class AdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdPlatform adplatform = (AdPlatform)request.getSession().getAttribute("adplatform");
        int userID = (Integer) request.getSession().getAttribute("userid");

        adplatform.AdClicked(userID);

        request.getSession().setAttribute("userbalance", adplatform.getAffiliatesDatabase().get(userID).getBalance());
        request.getSession().setAttribute("usertrackedbalance", adplatform.getAffiliatesDatabase().get(userID).getCumulativeBalance());
        request.getSession().setAttribute("affiliatetype", adplatform.getAffiliatesDatabase().get(userID).getType().name());

        response.sendRedirect("accountadmin.jsp");

    }
}
