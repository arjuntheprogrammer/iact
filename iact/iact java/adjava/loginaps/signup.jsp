<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>


<%
String uid=request.getParameter("uid");
String pass=request.getParameter("pass");
String eid=request.getParameter("emailid");

try
{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mylogin?user=root&password=");
PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?)");
ps.setString(1,uid);
ps.setString(2,pass);
ps.setString(3,eid);
int a=ps.executeUpdate();
if(a==1)
{	%>
    <jsp:forward page="login.html"/>
    <%
}
}
catch(Exception e)
{out.println(e);
	}
%>
