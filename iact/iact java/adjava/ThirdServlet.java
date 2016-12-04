import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ThirdServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");

PrintWriter out=res.getWriter();
String un=req.getAttribute("t1");
out.println("<b><font color=red size=20>User Name is"+un");
}}