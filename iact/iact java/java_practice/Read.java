import java.util.*;
class Read{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
//System.out.println("string is="+str);
char st[]= new char[50];
for(int i=0;i<str.length();i++)
 st[i]=str.charAt(i);

for(int i=0;i<str.length();i++)
System.out.print(st[i]);

}


}