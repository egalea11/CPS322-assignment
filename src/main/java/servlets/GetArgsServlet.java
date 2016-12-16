package servlets;

import cps3222.classes.AdPlatform;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Etienne G on 16/12/2016.
 */

// web servlet that gets cucumber scenario test balance and sets them as new balance for the testing affiliate with ID:111
@WebServlet(name = "GetArgsServlet", urlPatterns = "/getArgs")
public class GetArgsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get arguments from url
        String arg1 = request.getParameter("arg1");
        String arg2 = request.getParameter("arg2");

        // form double from url arguments
        Double balance = Double.parseDouble(arg1 + "." + arg2);

        // get adplatform from current session
        AdPlatform adplatform = (AdPlatform)request.getSession().getAttribute("adplatform");

        // set new balance of test affiliate
        adplatform.getAffiliatesDatabase().get(111).setBalance(balance);

        // set adplatform to current session
        request.getSession().setAttribute("adplatform", adplatform);

        System.out.println();
    }
}
