import java.sql.*;
import java.util.*;

class AddRecord
{
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
try
{
System.out.println("Enter employee no");
int eno=s1.nextInt();

System.out.println("Enter employee name");
String en=s1.next();

System.out.println("Enter employee Salary");
int sl=s1.nextInt();

System.out.println("Enter Department name");
String dn=s1.next();

Class.forName("com.mysql.jdbc.Driver");//load the driver
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdatajava1?user=root&password=");//connection with database

PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");

ps.setInt(1,eno);
ps.setString(2,en);
ps.setInt(3,sl);
ps.setString(4,dn);

int a=ps.executeUpdate();
if(a==1)
System.out.println("Record Added");
else
System.out.println("Record not Added");

}
catch(Exception e)
{
System.out.println(e);
}}}