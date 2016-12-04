<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@page import="java.sql.*"%>
</head>

<body>
<%
String uid=request.getParameter("uid");
String pass=request.getParameter("pass");
try
{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mylogin?user=root&password=");
PreparedStatement ps=con.prepareStatement("select * from login where uid=? and password=?");
ps.setString(1,uid);
ps.setString(2,pass);
ResultSet rs=ps.executeQuery();
if(rs.next())
{	%>
    <jsp:forward page="welcome.jsp"/>
    <%
}
else
{out.println("INVALID USER NAME AND PASSWORD");
%>
<jsp:include page="login.html"/>
<%
}}
catch(Exception e)
{out.println(e);
	}


%>
</body>
</html>