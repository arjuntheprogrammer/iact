
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Del1 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();

try
{

int empno=Integer.parseInt(req.getParameter("emp11"));

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/bank?user=root&password=");

PreparedStatement ps=con.prepareStatement("delete from employee where empno=?");

ps.setInt(1,empno);

int a=ps.executeUpdate();

if(a==1)
{
out.println("Record Successfully Deleted");
}



}
catch(Exception e)
{
out.println(e);

}

}
}