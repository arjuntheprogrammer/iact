import java.sql.*;
import java.util.*;
class SearchRecord
{public static void main(String ar[])
{Scanner s1=new Scanner(System.in);
System.out.println("Enter Employee no to be search");
int eno=s1.nextInt();
try
{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdatajava1?user=root&password=");
PreparedStatement ps=con.prepareStatement("select * from emp where empno=?");
ps.setInt(1,eno);
ResultSet rs=ps.executeQuery();
if(rs.next())
{System.out.println("Employee No is\t"+rs.getInt(1));
System.out.println("Employee Name is\t"+rs.getString(2));
System.out.println("Employee Salary is\t"+rs.getInt(3));
System.out.println("Employee Deparement  is\t"+rs.getString(4));
System.out.println("\n\n=======================\n");
}
else
System.out.println("No record found");
}
catch(Exception e)
{System.out.println(e);}}}