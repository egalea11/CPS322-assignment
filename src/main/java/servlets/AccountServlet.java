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
public class AccountServlet extends LoginServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Affiliate user = adplatform.getAffiliatesDatabase().get(111);
        String msg = "";
        if(adplatform.settleAffiliateBalance(111)){
            msg = "Balance settled!";
        }
        else{
            msg = "Transaction Invalid!";
        }
        request.getSession().setAttribute("transactionMsg", msg);
        request.getSession().setAttribute("userbalance", user.getBalance());

        response.sendRedirect("accountadmin.jsp");

//        String balanceString = (String)request.getSession().getAttribute("userbalance");
//        System.out.print(balanceString);
//
//        float balance = Float.valueOf(balanceString);
//        System.out.print(balance);




    }
}