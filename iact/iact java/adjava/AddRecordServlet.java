import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class AddRecordServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();

		try
		{

			int rno=Integer.parseInt(req.getParameter("t1"));
			String sn=req.getParameter("t2");
			String cn=req.getParameter("t3");
			String cno=req.getParameter("t4");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/studentdata?user=root&password=");

			PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?,?)");

			ps.setInt(1,rno);
			ps.setString(2,sn);
			ps.setString(3,cn);
			ps.setString(4,cno);

			int a=ps.executeUpdate();
			if(a==1)
			{
				out.println("Record Successfully added");
			}
			else
			{
				out.println("Record Successfully not added");
			}
		}
		catch(Exception e)
		{
			out.println(e);

		}

	}
}