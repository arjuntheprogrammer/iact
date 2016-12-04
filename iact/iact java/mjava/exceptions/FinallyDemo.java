import java.util.Scanner;
class DivideNumber
{public static int divide(int a,int b)
{try
{int c=a/b;
return c;
}
catch(Exception e)
{System.out.println(e);
return 0;
}
finally
{System.out.println("I am finally block");
}}}
class FinallyDemo
{public static void main(String ar[])
{Scanner s1=new Scanner(System.in);
System.out.println("Enter two no");
int a=s1.nextInt();
int b=s1.nextInt();
int c=DivideNumber.divide(a,b);
System.out.println("RESULT IS\t"+c);
}}