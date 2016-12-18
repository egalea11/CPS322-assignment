package servlets;

import cps3222.classes.AdPlatform;
import cps3222.classes.Affiliate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Etienne G on 18/12/2016.
 */

@WebServlet(name = "AdvertServlet", urlPatterns = "/adclick")
public class AdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdPlatform adplatform = (AdPlatform)request.getSession().getAttribute("adplatform");
        Affiliate adAffiliate = (Affiliate)request.getSession().getAttribute("affiliate");

        adplatform.AdClicked(111);

        request.getSession().setAttribute("userbalance", adplatform.getAffiliatesDatabase().get(111).getBalance());
        request.getSession().setAttribute("usertrackedbalance", adplatform.getAffiliatesDatabase().get(111).getCumulativeBalance());
        request.getSession().setAttribute("affiliatetype", adplatform.getAffiliatesDatabase().get(111).getType().name());

        response.sendRedirect("accountadmin.jsp");

    }
}
