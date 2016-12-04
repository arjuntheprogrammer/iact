import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class WelcomeServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();
out.println("WELCOME");
}
}