package mypack;

import java.sql.*;

public class MyData
{

int eno,sal,dno;
String ename;
public MyData()
{}

public int getEno()
{
return eno;
}
public void setEno(int eno)
{
this.eno=eno;
}


public int getSal()
{
return sal;
}
public void setSal(int sal)
{
this.sal=sal;
}

public int getDno()
{
return dno;
}
public void setDno(int dno)
{
this.dno=dno;
}

public String getEname()
{
return ename;
}
public void setEname(String ename)
{
this.ename=ename;
}


Connection con=null;

public Connection myConnection()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myemployee?user=root&password=");
return con;
}
catch(Exception e)
{
return null;
}


}

public int addRecord()
{
try
{
con=myConnection();
PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");

ps.setInt(1,eno);
ps.setString(2,ename);
ps.setInt(3,sal);
ps.setInt(4,dno);
int a=ps.executeUpdate();


return a;
}
catch(Exception e)
{
return 0;
}
}
}
