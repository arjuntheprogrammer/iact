import java.sql.*;
import java.util.*;

class BankDemo
{
Connection con;
public Connection giveConnection()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/iactdatajava1?user=root&password=");

}
catch(Exception e)
{
System.out.println(e);
}
return con;
}
public void openAccount(int ano,String cn,String at,int bal)
{try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?)");
ps.setInt(1,ano);
ps.setString(2,cn);
ps.setString(3,at);
ps.setInt(4,bal);
int a=ps.executeUpdate();
if(a==1)
System.out.println("Account opend");
else
System.out.println("Account not opend");

}
catch(Exception e)
{System.out.println(e);}
}


public void depositMoney(int ano,int amt)
{try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("update customer set balance=balance+? where acno=?");
ps.setInt(1,amt);
ps.setInt(2,ano);
int a=ps.executeUpdate();
if(a==1)
System.out.println("Amount deposited");
else
System.out.println("Amount not deposited");
}
catch(Exception e)
{System.out.println(e);}
}


public void withdrawMoney(int ano,int amt)
{try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("update customer set balance=balance-? where acno=?");
ps.setInt(1,amt);
ps.setInt(2,ano);
int a=ps.executeUpdate();
if(a==1)
System.out.println("Amount withdrawn");
else
System.out.println("Amount not withdrawn");
}
catch(Exception e)
{System.out.println(e);}
}

public void closeAccount(int ano)
{try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("delete from customer where acno=?");
ps.setInt(1,ano);
int a=ps.executeUpdate();
if(a==1)
System.out.println("Account closed");
else
System.out.println("Amount not closed");
}
catch(Exception e)
{System.out.println(e);}
}


public void enquiry(int ano)
{
try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("select * from customer where acno=?");
ps.setInt(1,ano);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
System.out.println("\nAccount no is\t"+rs.getInt(1));
System.out.println("\nAccount Name is\t"+rs.getString(2));
System.out.println("\nAccount type is\t"+rs.getString(3));
System.out.println("\nAccount balance is\t"+rs.getInt(4));
}
else
{
System.out.println("Account no not found");
}
}
catch(Exception e)
{
System.out.println(e);
}
}


public void displayAll()
{
try
{
con=giveConnection();
PreparedStatement ps=con.prepareStatement("select * from customer ");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
System.out.println("\nAccount no is\t"+rs.getInt(1));
System.out.println("\nAccount Name is\t"+rs.getString(2));
System.out.println("\nAccount type is\t"+rs.getString(3));
System.out.println("\nAccount balance is\t"+rs.getInt(4));
System.out.println("\n======================\n");
}
}
catch(Exception e)
{
System.out.println(e);
}
}


}
class UserBank
{
public static void main(String ar[])
{
int k;
BankDemo cust=new BankDemo();
Scanner s1=new Scanner(System.in);
do
{
System.out.println("Bank Menu");
System.out.println("\n1.Open Account");
System.out.println("\n2.Deposit Money");
System.out.println("\n3.Withdraw Money");
System.out.println("\n4.Blanace Enquiry");
System.out.println("\n5. Display All");
System.out.println("\n6. Close Account");
System.out.println("\n7. Exit");

System.out.println("\nEnter Your choice");
int ch=s1.nextInt();

switch(ch)
{
case 1:
System.out.println("Enter Account no");
int ano=s1.nextInt();
System.out.println("Enter Customer Name");
String cn=s1.next();
System.out.println("Enter AccountType");
String at=s1.next();
System.out.println("Enter Account Balance");
int bal=s1.nextInt();
cust.openAccount(ano,cn,at,bal);
break;
case 2:
System.out.println("Enter Account no");
ano=s1.nextInt();
System.out.println("Enter Amont to be deposited");
int amt=s1.nextInt();
cust.depositMoney(ano,amt);


break;
case 3:
System.out.println("Enter Account no");
ano=s1.nextInt();
System.out.println("Enter Amont to be withdraw");
amt=s1.nextInt();
cust.withdrawMoney(ano,amt);

break;
case 4:
System.out.println("Enter Account no");
ano=s1.nextInt();
cust.enquiry(ano);

break;
case 5:
cust.displayAll();

break;
case 6:
System.out.println("Enter Account no");
ano=s1.nextInt();
cust.closeAccount(ano);

break;
case 7:
System.exit(0);
break;
default:
System.out.println("\n\nInvalid choice");

}
System.out.println("\n\nDo u want to cont....press 1 for no");
k=s1.nextInt();
}while(k!=1);
}}