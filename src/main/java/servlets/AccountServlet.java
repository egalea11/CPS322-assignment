package servlets;

import cps3222.classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AccountServlet", urlPatterns= { "/account"})
public class AccountServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AdPlatform adplatform = (AdPlatform) request.getSession().getAttribute("adplatform");
        int userID = (Integer) request.getSession().getAttribute("userid");

        String msg = "";
        if (adplatform.settleAffiliateBalance(userID) == true) {
            msg = "Balance settled!";
            System.out.println("Success!");
            System.out.println("User balance is now: " + adplatform.getAffiliatesDatabase().get(userID).getBalance());
        } else if (adplatform.settleAffiliateBalance(userID) == false) {
            msg = "Transaction Invalid!";
            System.out.println("Failed!");
            System.out.println("User balance is still: " + adplatform.getAffiliatesDatabase().get(userID).getBalance());
        }

        request.getSession().setAttribute("transactionMsg", msg);
        request.getSession().setAttribute("userbalance", adplatform.getAffiliatesDatabase().get(userID).getBalance());

        response.sendRedirect("accountadmin.jsp");
    }

}

