package servlets;

import cps3222.classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", urlPatterns= { "/login"})
public class LoginServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int errorCode = 0;  // no errors
        int id = Integer.parseInt(request.getParameter("id"));
        String pass = request.getParameter("password");
        String errorMsg = " ";
        AdPlatform adplatform = new AdPlatform();

        Affiliate user = adplatform.getAffiliatesDatabase().get(id);

        // if user exists in database
        if (user != null) {
            if (user.getId() == id){
                System.out.println("User exists");
                // if password is correct
                if (adplatform.getAffiliatesDatabase().get(id).getPassword().equals(pass)){
                    System.out.println("password OK!\nlogging in...");
                    // set session variables
                    request.getSession().setAttribute("userid", user.getId());
                    request.getSession().setAttribute("username", user.getName());
                    request.getSession().setAttribute("userbalance", user.getBalance());
                    request.getSession().setAttribute("usertrackedbalance", user.getCumulativeBalance());
                    request.getSession().setAttribute("affiliatetype", user.getType().name());
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
                errorMsg = "";
                request.getSession().setAttribute("adplatform", adplatform);
                request.getSession().setAttribute("user", user);
                response.sendRedirect("accountadmin.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                errorMsg = "Invalid Credentials!";
                request.getSession().setAttribute("errormsg", errorMsg);
                response.sendRedirect("index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
