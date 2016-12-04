import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WordServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();
res.setContentType("application/ms-word");
out.println("I am word servlet");
}
}