import java.util.Scanner;
class MyException extends Exception
{
String message;
public MyException()
{
message="invalid no";
}
public String getMessage()
{
return message;
}}

class OwnExceptionDemo
{
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter any no");
try
{int num=s1.nextInt();
if(num%2==0)
System.out.println("Even no");
else
throw new MyException();
}
catch(Exception e)
{System.out.println(e.getMessage());
}}}