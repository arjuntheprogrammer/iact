class StringBufferDemo
{public static void main(String ar[])
{String s1="iact";
String s2="iect";
int f=0;
if(s1.length()!=s2.length())
{f=1;}
for(int i=0;i<s1.length();i++)
{if(s1.charAt(i)!=s2.charAt(i))
{f=1;break;}}
if(f==0)
System.out.println("Strings are equal");
else
System.out.println("Stirngs are not equal");
}}