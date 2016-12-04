//url=drec

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class DisplayServlet extends HttpServlet
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
while(rs.next())
{
out.println("\n Roll number is\t\t"+rs.getInt(1));
out.println("\n Student name is\t\t"+rs.getString(2));
out.println("\n Course name is\t\t"+rs.getString(3));
out.println("\n Contact number is\t\t"+rs.getString(4));
out.println("\n\n****************************************************************\n\n");
}

}
catch(Exception e)
{
out.println(e);

}

}
}