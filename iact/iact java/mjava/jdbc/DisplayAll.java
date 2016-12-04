import java.sql.*;
import java.util.*;

class DisplayAll
{
public static void main(String ar[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdatajava1?user=root&password=");

PreparedStatement ps=con.prepareStatement("select * from emp");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
System.out.println("Employee No is\t"+rs.getInt(1));
System.out.println("Employee Name is\t"+rs.getString(2));
System.out.println("Employee Salary is\t"+rs.getInt(3));
System.out.println("Employee Deparement  is\t"+rs.getString(4));
System.out.println("\n\n=======================\n");


}
}
catch(Exception e)
{
System.out.println(e);
}
}}
