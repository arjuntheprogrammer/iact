import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;

public class ShowServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
int dno=Integer.parseInt(req.getParameter("t1"));
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=");
PreparedStatement ps=con.prepareStatement("select * from dept where deptno=?");
ps.setInt(1,dno);
ResultSet rs=ps.executeQuery();
out.println("<table border=1><tr><td>Employee No</td><td>Employee Name</td><td>Employee Salary</td><td>Deptno</td></tr>");
while(rs.next())
{
out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td></tr>");

}
out.println("</table>");
}
catch(Exception e)
{
out.println(e);
}}}