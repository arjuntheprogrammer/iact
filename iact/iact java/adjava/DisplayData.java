import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class DisplayData extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();





try
{


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/bank?user=root&password=");

PreparedStatement ps=con.prepareStatement("select * from employee");

ResultSet rs=ps.executeQuery();



out.println("<html><body>");
out.println("<form method='get' action='dds1'>");
out.println("<table align=center>");
out.println("<tr>");
out.println("<td>Select Employee Number</td>");
out.println("<td><select name=s1><option>Select Employee Number</option>");



while(rs.next())
{
out.println("<option>"+rs.getString(1)+"</option>");
}
out.println("</select></td></tr>");
out.println("<tr><td colspan=2 align=center><input type='submit' value='SHOW' name='b1'></td></tr>");

out.println("<tr><td colspan=2 align=center><input type='submit' value='DELETE' name='b1'></td></tr>");

out.println("</table>");
out.println("</form>");




out.println("</body></html>");
}
catch(Exception e)
{
out.println(e);
}



}
}