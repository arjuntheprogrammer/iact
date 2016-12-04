class StringLib
{public static void main(String ar[])
{/*
String s1="iact education";
System.out.println("String in upper case are\t"+s1.toUpperCase());
String s2="hello";
s2.toUpperCase();
System.out.println("String is\t"+s2);
*/
String p="iact educaiton";
char x[]=new char[50];
x=p.toCharArray();
for(int i=0;i<x.length;i++)
System.out.print(x[i]+"  ");
}}