import java.sql.*;
import java.util.*;
class DelRecord
{public static void main(String ar[])
{Scanner s1=new Scanner(System.in);
try
{System.out.println("Enter employee no");
int eno=s1.nextInt();
Class.forName("com.mysql.jdbc.Driver");//load the driver
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdatajava1?user=root&password=");//connection with database
PreparedStatement ps=con.prepareStatement("delete from emp where empno=?");
ps.setInt(1,eno);
int a=ps.executeUpdate();
if(a==1)
System.out.println("Record deleted");
else
System.out.println("Record not deleted");
}catch(Exception e)
{System.out.println(e);}}}
/*
variablename=classpath=
variable value=.;d:\mysql-connector-java-5.1.2.jar
*/
