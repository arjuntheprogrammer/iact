class CommandDemo
{
public static void main(String ar[])
{
System.out.println("No of passing arguments are\t"+ar.length);
int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);
int c=a+b;
System.out.println("Sum is\t"+c);
String n=ar[2];
System.out.println("3 argument is\t"+n);
}}