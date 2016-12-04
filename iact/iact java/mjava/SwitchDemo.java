import java.util.Scanner;
class SwitchDemo
{public static void main(String ar[])
{int k=0;
Scanner s1=new Scanner(System.in);
do
{System.out.println("\nMain Menu");
System.out.println("\n1.\tOddEven");
System.out.println("\n2.\tGreater in two no");
System.out.println("\n3.\tFactorial");
System.out.println("\n4.\tExit");
System.out.println("Enter your choice");
int ch=s1.nextInt();
switch(ch)
{case 1:
System.out.println("\n\nEnter any no");
int num=s1.nextInt();
if(num%2==0)
System.out.println("EVEN NO");
else
System.out.println("Odd no");
break;
case 2:
System.out.println("\n\nEnter two no");
int num1=s1.nextInt();
int num2=s1.nextInt();
if(num1>num2)
System.out.println("First no is gerater");
else if(num1==num2)
System.out.println("Both are equals");
else
System.out.println("second no is greater");
break;
case 3:
System.out.println("\n\nEnter any no");
num=s1.nextInt();
int f=1;
for(int i=1;i<=num;i++)
f=f*i;
System.out.println("Factorial is\t\t"+f);
break;
case 4:
System.exit(0);
break;
default:
System.out.println("\n\nInvalid choice");
}
System.out.println("Do u want to cont...press 1 for no");
k=s1.nextInt();
}while(k!=1);
}}