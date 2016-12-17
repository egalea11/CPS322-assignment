package servlets;

import cps3222.classes.*;

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
        AdPlatform adplatform = (AdPlatform)request.getSession().getAttribute("adplatform");

        String advertKeyword = request.getParameter("keyword");
        System.out.println(advertKeyword);


        // add new advert
        String adName ="Clash of Clans";
        Advert ad = new Advert(001, adName, new AdFormat(MediaType.IMAGE, Dimensions.MEDIUM, advertKeyword));
//        Advert ad = adplatform.serveAdvert(new AdDescription(new AdFormat(MediaType.IMAGE, Dimensions.MEDIUM, advertKeyword)));
        adplatform.registerAdvert(ad);

        ad.setName(adName);

        request.getSession().setAttribute("advert", ad);
        request.getSession().setAttribute("adName", adName);
        response.sendRedirect("accountadmin.jsp");
    }
}
