
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class DisplayData1 extends HttpServlet
{


PreparedStatement ps=null;

public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();


try
{

String empno=req.getParameter("s1");
String x=req.getParameter("b1");

String site = new String("dds");


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/bank?user=root&password=");

if(x.equals("SHOW"))
{

ps=con.prepareStatement("select * from employee where empno=?");

ps.setString(1,empno);

ResultSet rs=ps.executeQuery();




if(rs.next())
{
out.println("<table border=1 align=center >  ");
out.println("<tr><td>Employee Number</td><td>"+rs.getString(1)+"</td></tr>");
out.println("<tr><td>Employee Name</td><td>"+rs.getString(2)+"</td></tr>");
out.println("<tr><td>Employee Salary</td><td>"+rs.getString(3)+"</td></tr>");
out.println("<tr><td>Employee Department Number</td><td>"+rs.getString(4)+"</td></tr>");
out.println("</table>");
}
}

else if(x.equals("DELETE"))
{
ps=con.prepareStatement("delete from employee where empno=?");

ps.setString(1,empno);

int a=ps.executeUpdate();

if(a==1)
{

//out.println("Record successfully deleted");

res.setStatus(res.SC_MOVED_TEMPORARILY);
      res.setHeader("Location", site);  

}


}
}
catch(Exception e)
{
out.println(e);

}

}
}