import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SecondServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String un=req.getParameter("t1");
String em=req.getParameter("t2");
String ps=req.getParameter("t3");

out.println("<form method=get action=third>");
out.println("<input type=text value="+un+" name=t1>");
out.println("<input type=text value="+em+" name=t2>");
out.println("<input type=hidden name=t3 value="+ps+">");
out.println("<input type=submit value=submit>");
out.println("</form>");
}}