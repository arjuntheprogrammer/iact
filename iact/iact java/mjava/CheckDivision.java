import java.util.Scanner;
class CheckDivision
{public static void main(String ar[])
{Scanner s1=new Scanner(System.in);
System.out.println("Enter percentage");
int p=s1.nextInt();
if(p>=80)
System.out.println("First division");
else if(p>=45&&p<88)
System.out.println("Second divison");
else if(p>=33&&p<45)
System.out.println("IIIRD division");
else
System.out.println("Banta dhar");
}}