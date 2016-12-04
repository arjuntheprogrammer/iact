// url=dstable

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class DisplayServletTable extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();

try
{


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/studentdata?user=root&password=");

PreparedStatement ps=con.prepareStatement("select * from student1");

ResultSet rs=ps.executeQuery();
out.println("<html>");
out.println("<body>");

out.println("<table border=1 align=center >  ");
out.println("<tr>");
out.println("<td><b>Roll Number</b></td>");
out.println("<td><b>Student Name</b></td>");
out.println("<td><b>Course Name</b></td>");
out.println("<td><b>Contact Number</b></td>");
out.println("</tr>");

while(rs.next())
{
out.println("<tr>");
out.println("<td>"+(rs.getInt(1))+"</td>");
out.println("<td>"+(rs.getString(2))+"</td>");
out.println("<td>"+(rs.getString(3))+"</td>");
out.println("<td>"+(rs.getString(4))+"</td>");
out.println("</tr>");
}
out.println("</table>");
out.println("</body>");
out.println("</html>");
}
catch(Exception e)
{
out.println(e);

}

}
}