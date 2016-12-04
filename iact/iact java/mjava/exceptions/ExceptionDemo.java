class ExceptionDemo
{public static void main(String ar[])
{System.out.println("Good Morning");
try
{String x="iact";
System.out.println("String after conver is\t"+x.toUpperCase());
int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);
int c=a/b;
System.out.println("Result has come..."+c);
System.out.println("Process is going to be fine.....");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Testing finish....");
System.out.println("ALL THE BEST");
System.out.println("Thank u.....");
}}