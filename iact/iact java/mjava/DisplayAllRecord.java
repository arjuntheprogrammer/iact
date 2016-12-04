import java.sql.*;
class DisplayAllRecord
{
static Connection con;
static Connection myConnection()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=");
return con;
}
catch(Exception e)
{
return null;
}}
public static void main(String ar[])
{
try
{
con=myConnection();
PreparedStatement ps=con.prepareStatement("select * from employee");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
System.out.println("Employee No is\t"+rs.getInt(1));
System.out.println("Employee Name is\t"+rs.getString(2));
System.out.println("Employee Salary is\t"+rs.getInt(3));
System.out.println("Employee Deparement Name is\t"+rs.getString(4));
System.out.println("\n\n=======================\n\n");

}

}
catch(Exception e)
{
System.out.println(e);
}
}}