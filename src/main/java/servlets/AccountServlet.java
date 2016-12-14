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

@WebServlet(name = "AccountServlet", urlPatterns= { "/account"})
public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AdPlatform adplatform = (AdPlatform) request.getSession().getAttribute("adplatform");
        Affiliate user = adplatform.getAffiliatesDatabase().get(111);
        String msg = "";
        if (adplatform.settleAffiliateBalance(111) == true) {
            msg = "Balance settled!";
            System.out.println("Success!");
            System.out.println("User balance is now: " + user.getBalance());
        } else if (adplatform.settleAffiliateBalance(111) == false) {
            msg = "Transaction Invalid!";
            System.out.println("Failed!");
            System.out.println("User balance is still: " + user.getBalance());
        }
//        Affiliate testUser = adplatform.getAffiliatesDatabase().get(111);
//        String bal = "" + Integer.toString(4) + "." + Integer.toString(99);
//        Double balance = Double.parseDouble(bal);
//        System.out.println(balance);
//        testUser.setBalance(balance);
//        System.out.println(testUser.getBalance());

        request.getSession().setAttribute("transactionMsg", msg);
        request.getSession().setAttribute("userbalance", user.getBalance());

        response.sendRedirect("accountadmin.jsp");
    }
}

