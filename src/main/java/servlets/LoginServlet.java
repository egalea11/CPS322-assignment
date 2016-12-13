package servlets;

import cps3222.classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Etienne G on 12/12/2016.
 */

@WebServlet(name = "LoginServlet", urlPatterns= { "/accountadmin"})
public class LoginServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int errorCode = 0;  // no errors
        int id = Integer.parseInt(request.getParameter("id"));
        String pass = request.getParameter("password");

        AdPlatform adplatform = new AdPlatform();

        PrintWriter writer = response.getWriter();

        // initialise sample affiliate
        adplatform.initAffiliates();


        Affiliate user = adplatform.getAffiliatesDatabase().get(id);


        // if user exists in database
        if (user != null) {
            if (user.getId() == id){
                System.out.println("User exists");
                // if password is correct
                if (adplatform.getAffiliatesDatabase().get(id).getPassword().equals(pass)){
                    System.out.println("password OK!\nlogging in...");
                    // set session variables
                    request.getSession().setAttribute("username", user.getName()); // add to session
                    request.getSession().setAttribute("userbalance", user.getBalance()); // add to session
                }
                else {
                    System.out.println("password mismatch!");
                    errorCode = 2;  // password mismatch
                }
            }
            else{
                System.out.println("User does NOT exist");
                errorCode = 1;  // user does not exist
            }
        }
        else {
            errorCode = 1;  // user does not exist
        }

        if(errorCode == 0){
            try {
                response.sendRedirect("accountadmin.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                request.getSession().setAttribute("errormsg", errorCode);
                response.sendRedirect("index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
