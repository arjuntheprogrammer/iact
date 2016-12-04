import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*; 

public class SumServlet extends HttpServlet
{

public void doGet(HttpServletResponse response,HttpServletRequest request)throws IOException,ServletException

{

PrintWriter out=response.getWriter();


int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));

int c=a+b;

out.println("sum is"+c);

}
}