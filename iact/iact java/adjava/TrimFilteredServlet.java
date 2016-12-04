import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class TrimFilteredServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{

String firstName=(String) req.getAttribute("firstName");
String lastName=(String) req.getAttribute("lastName");
String userName=(String) req.getAttribute("userName");
String password=(String) req.getAttribute("password");

res.setContentType("text/html");

PrintWriter out=res.getWriter();

out.println("<HTML>");
out.println("<HEAD>");
out.println("<TITLE>Displaying Values</TITLE> ");
out.println("</HEAD>");
out.println("<BODY>");
out.println("<CENTER>");
out.println("Here are your details.");
out.println("<TABLE>");
out.println("<TR>");
out.println("<TD>First Name:</TD>");
out.println("<TD>" + (firstName) + "</TD>");
out.println("</TR>");
out.println("<TR>");
out.println("<TD>Last Name:</TD>");
out.println("<TD>" + (lastName) + "</TD>");
out.println("</TR>");
out.println("<TR>");
out.println("<TD>User Name:</TD>");
out.println("<TD>" + (userName) + "</TD>");
out.println("</TR>");
out.println("<TR>");
out.println("<TD>Password:</TD>");
out.println("<TD>" + (password) + "</TD>");

out.println("</TABLE>");
out.println("</CENTER>");
out.println("</BODY>");
out.println("</HTML>");
}}
