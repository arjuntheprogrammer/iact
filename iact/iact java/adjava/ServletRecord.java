import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class ServletRecord extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();
try
{
int eno=Integer.parseInt(req.getParameter("t1"));
String ename=req.getParameter("t2");
String fn=req.getParameter("t3");
String ad=req.getParameter("t4");
String cno=req.getParameter("t5");
int dno=Integer.parseInt(req.getParameter("t7"));
String eid=req.getParameter("t7");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection
("jdbc:mysql://localhost/empl?user=root&password=");
PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");

ps.setInt(1,eno);
ps.setString(2,ename);
ps.setString(3,fn);
ps.setString(4,ad);
ps.setString(5,cno);
ps.setInt(6,dno);
ps.setString(7,eid);

int a=ps.executeUpdate();
if(a==1)
{
out.println("Record Successfully Added");
}
else
{
out.println("Record Successfully not Added");
}
}
catch(Exception e)
{
out.println(e);
}
}
}