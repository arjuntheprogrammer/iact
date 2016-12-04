import java.util.Scanner;
class Bank
{
private int acno,balance;
private String cname,actype;
public void openAccount()
{Scanner s1=new Scanner(System.in);
System.out.println("Enter account no");
acno=s1.nextInt();
System.out.println("Enter Customer Name");
cname=s1.next();
System.out.println("Enter account type");
actype=s1.next();
System.out.println("Enter account balance");
balance=s1.nextInt();
}
public void depositMoney(int amt)
{balance=balance+amt;
System.out.println("Amount deposited and your current balance is"+balance);
}
public void withdrawMoney(int amt)
{if(balance>amt)
{balance=balance-amt;
System.out.println("Amount withdrawn and your current balance is"+balance);
}
else
System.out.println("Not sufficient fund");
}
public void enquiryAccount()
{System.out.println("Account no is\t\t"+acno);
System.out.println("Customer Name is\t\t"+cname);
System.out.println("Account Type is\t\t"+actype);
System.out.println("Account Balance is\t\t"+balance);
}}

class BankDemo
{public static void main(String ar[])
{int k=0;
Bank cust=new Bank();
Scanner s1=new Scanner(System.in);
do
{System.out.println("\n\n1.Open Account");
System.out.println("\n\n2. Deposit Money");
System.out.println("\n\n3.Withdraw Money");
System.out.println("\n\n4.Enquiry");
System.out.println("\n\n5.Exit");

System.out.println("\n\nEnter Your Choice");
int ch=s1.nextInt();
switch(ch)
{
case 1:
cust.openAccount();
break;
case 2:
System.out.println("Enter amount to be deposited");
int amount=s1.nextInt();
cust.depositMoney(amount);
break;
case 3:
System.out.println("Enter amount to be withdrawn");
amount=s1.nextInt();
cust.withdrawMoney(amount);
break;
case 4:
cust.enquiryAccount();
break;
case 5:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}
System.out.println("\n\nDo u want to cont..press 1 for no");
k=s1.nextInt();
}while(k!=1);
}}