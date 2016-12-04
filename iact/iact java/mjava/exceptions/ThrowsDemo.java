class DivideNum
{static int divide(int a,int b)throws ArithmeticException
{int c=a/b;
return c;
}}
class ThrowsDemo
{public static void main(String ar[])
{try
{int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);
int n=DivideNum.divide(a,b);
System.out.println("Result is\t"+n);
}
catch(Exception e)
{System.out.println(e);
}
System.out.println("...PROGRAM FINISH");
}}

