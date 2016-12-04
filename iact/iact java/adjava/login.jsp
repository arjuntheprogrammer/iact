<%@page import="java.sql.*" errorPage="error.jsp" %>
<%
try
{
String uid=request.getParameter("uid");
String pass=request.getParameter("pass");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/logindata?user=root&password=");
PreparedStatement ps=con.prepareStatement("select * from login where uid=? and password=?");
ps.setString(1,uid);
ps.setString(2,pass);

ResultSet rs=ps.executeQuery();
if(rs.next())
{
%>
<jsp:forward page="welcome.jsp"/>


<%
}
else
{
out.println("Invalid user name and password");
%>
<jsp:include page="login.html"/>
<%
}
}
catch(Exception e)
{
out.println(e);
}

%>



