import java.util.Scanner;
class ThrowDemo
{public static void main(String ar[])
{Scanner s1=new Scanner(System.in);
System.out.println("Enter any no");
try
{int num=s1.nextInt();
if(num%2==0)
System.out.println("Even no");
else
throw new ArithmeticException();
}catch(Exception e)
{System.out.println(e);
}
System.out.println("I am after catch block");
}}