package mypack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    urlPatterns = {"/InitParamExample"},
    initParams = {
        @WebInitParam(name = "address", value = "123 Main Street"),
        @WebInitParam(name = "email", value = "example@example.com"),
        @WebInitParam(name = "phone", value = "+1234567890")
    }
)
public class InitParamExample extends HttpServlet {   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();      

        ServletConfig config = getServletConfig();        
        String address = config.getInitParameter("address");
        String email = config.getInitParameter("email");
        String phone = config.getInitParameter("phone");

        out.print("Address: " + address + "<br>");
        out.print("Email: " + email + "<br>");
        out.print("Phone: " + phone);
      
        out.close();     
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
