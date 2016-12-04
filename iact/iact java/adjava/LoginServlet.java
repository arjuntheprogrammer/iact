import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();
String a=req.getParameter("t1");
String b=req.getParameter("t2");
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/loginform?user=root&password=");
PreparedStatement ps=con.prepareStatement("select * from login where username1=? and password=?");
ps.setString(1,a);
ps.setString(2,b);

RequestDispatcher rd=null;

ResultSet rs=ps.executeQuery();
if(rs.next())
{
rd=req.getRequestDispatcher("welcome");
}
else
{
rd=req.getRequestDispatcher("error");
}
rd.forward(req,res);
}
catch(Exception e)
{
out.println(e);
}
}
}